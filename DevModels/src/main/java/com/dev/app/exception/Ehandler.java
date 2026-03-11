package com.dev.app.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

//import com.dev.app.model.User;

//import lombok.experimental.StandardException;

public class Ehandler extends RuntimeException{
	

	public Ehandler(String message) {
		super(message);
	}
}
