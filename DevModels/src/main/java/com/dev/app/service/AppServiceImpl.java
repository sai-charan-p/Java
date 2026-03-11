package com.dev.app.service;

//import com.dev.app.controller.AppController;
import com.dev.app.exception.Ehandler;
import com.dev.app.model.User;
import com.dev.app.repository.AppRepository;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppServiceLayer{

//    private final AppController appController;
	
    private final AppRepository repo;

    public AppServiceImpl(AppRepository repo) {
        this.repo = repo;
//        this.appController = appController;
    }

    public String insertUser(User user) {
        repo.save(user);
        return "User added successfully";
    }
    
    public String updateUserRecord(User user) {
    	if (!repo.existsById(user.getUserid())) {
            throw new Ehandler(
                "User with ID " + user.getUserid() + " not found"
            );
        }

        repo.save(user);
        return "User updated successfully";
//        repo.update(user);
//        return "User updated successfully";
    }
    
    public String deleteUserRecord(User user) {
    	repo.delete(user);
    	return repo.existsById(user.getUserid())? "userID:"+user.getUserid()+", record deleted":"no user available with user ID:"+user.getUserid();
    }
    
    public User getUserId(User user) {
    	return repo.findById(user.getUserid())
                .orElseThrow(() -> new Ehandler(
                        "User with ID " + user.getUserid() + " not found"
                ));
//    	User result = user.getUserid();
//
//        if (result == null) {
//            throw new Ehandler(
//                "User with ID " + user.getUserid() + " not found"
//            );
//        }
//
//        return result;
    	
    	
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
	
}
