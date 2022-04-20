package com.example.demo.exception;

public class TeamAlreadyExistsException extends Exception{
	public TeamAlreadyExistsException(String message) {
        super(message);
    }
}
