package com.atlas.studentservice.exception;

/**
 * Custom exception for invalid input or bad request
 */
public class BadRequestException extends RuntimeException {

	/**
	 * Unique version id for serialization(Prevence invalid class exception)
	 */
	private static final long serialVersionUID = 3004293227207188092L;

	/**
	 * Constructed to pass custom error message
	 * 
	 * @param message
	 */
	public BadRequestException(String message) {
		super(message);
	}
}
