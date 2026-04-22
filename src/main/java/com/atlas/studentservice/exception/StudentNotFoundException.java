package com.atlas.studentservice.exception;

/**
 * custom exception thrown when a user is not found
 */
public class StudentNotFoundException extends RuntimeException {
	/**
	 * Unique version id for serialization
	 */
	private static final long serialVersionUID = 2295650143432366405L;

	/**
	 * Constructed to pass custom error message
	 * 
	 * @param message error message
	 */
	public StudentNotFoundException(String message) {
		super(message);// call parent class constructor
	}

}
