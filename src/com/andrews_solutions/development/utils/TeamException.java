package com.andrews_solutions.development.utils;

public class TeamException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public TeamException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}

}
