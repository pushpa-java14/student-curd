package com.atlas.studentservice.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.atlas.studentservice.exception.BadRequestException;
import com.atlas.studentservice.exception.ErrorResponse;
import com.atlas.studentservice.exception.StudentNotFoundException;

public class GlobalExceptionHandler {
	/**
	 * Handle BadRequest
	 * 
	 * @param ex the exception object contains error details
	 * @return ResponceEntity containg error responce and HttpStatus 400
	 */
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ErrorResponse> handleBadRequest(BadRequestException ex) {
		ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value(), LocalDateTime.now());// create
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);// return responce with status 400
	}

	/**
	 * Handle StudentNotFoundException
	 * 
	 * @param ex the exception object contains error details
	 * @return ResponceEntity containg error responce and HttpStatus 404
	 */
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleStudentNotFound(StudentNotFoundException ex) {
		ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value(), LocalDateTime.now());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);// return responce with status 404
	}

	/**
	 * Handles all uncatch exceptions
	 * 
	 * @param ex generic exception object
	 * @return containg generic error message and HttpStatus 500
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex) {
		ErrorResponse error = new ErrorResponse("Something went wrong.Please try again later",
				HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);// return responce with status 500
	}

}
