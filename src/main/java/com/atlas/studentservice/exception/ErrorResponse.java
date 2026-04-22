package com.atlas.studentservice.exception;

/**
 * Standard error reponce formate
 */

import java.time.LocalDateTime;

public class ErrorResponse {
	private String message;// error message
	private int status;// http status code error
	private LocalDateTime timestamp;// time of error

	/**
	 * 
	 * @param message
	 * @param status
	 * @param timestamp
	 */
	public ErrorResponse(String message, int status, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
	}

	// getter for message
	public String getMessage() {
		return message;
	}

	// getter for status
	public int getStatus() {
		return status;
	}

	// getter for timestamp
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

}
