package com.example.demo.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	   private HttpStatus status;
	   private String message;
	
	// generate the setter and getter method
   public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	// generate the constructor field(within arugment)
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	// generate the constructor superclass(without arugment)
	public ErrorMessage() {
		super();
		}
	// generate the to string
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}
	   
	   
	   
}
