package com.dev.app.controller;

import com.dev.app.exception.Ehandler;
import com.dev.app.model.User;
import com.dev.app.service.AppServiceImpl;
import com.dev.app.wrapper.AppWrapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

//import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class AppController {

	private final AppServiceImpl service;

	@GetMapping("/")
	public String home() {
		return "Public Home Page";
	}

//	@GetMapping("/users")
//	public String users(Principal principal) {
//		return "Hello " + principal.getName();
//	}

	public AppController(AppServiceImpl service) {
		this.service = service;
	}

	// INSERT
	@PostMapping("/addUsers")
	public String add(@RequestBody User user) {
		return service.insertUser(user);
	}

	// UPDATE
	@PostMapping("/update")
	public String update(@RequestBody User user) {
		return service.updateUserRecord(user);
	}

	// Delete
	@PostMapping("/delete")
	public String delete(@RequestBody User user) {
		return service.deleteUserRecord(user);
	}
	
	@GetMapping("/getid")
	public User getid(@RequestBody User user) {
		return service.getUserId(user);
	}

	// SELECT ALL
	@GetMapping
	public List<User> getAll(){
		return service.getAllUsers();
	}
	
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public AppWrapper getAllUsersXml() {
    	System.out.println(service.getAllUsers());
        List<User> users = service.getAllUsers();
        System.out.println(new AppWrapper(users));
        return new AppWrapper(users); // wrap the list
    }
    
	@CrossOrigin
	@RestController
	public class UserController {
	}

}
