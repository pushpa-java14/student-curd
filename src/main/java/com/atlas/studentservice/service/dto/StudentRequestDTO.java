package com.atlas.studentservice.service.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class StudentRequestDTO {

	@NotBlank(message = "firstName is required")
	@Size(min = 3, max = 50, message = "firstName must be between 3 and 50 character")
	private String firstName;

	@NotBlank(message = "lastName is required")
	@Size(min = 3, max = 50, message = "firstName must be between 3 and 50 character")
	private String lastName;

	@NotBlank(message = "email is required")
	@Email(message = "Invaid email formate")
	private String emailId;

	@NotBlank(message = "password is required")
	@Size(min = 8, max = 20, message = "password must be 8 and 20 characters")
	@Pattern(regexp = "^(?=.[A-2](?=.[a-z](?=\\\\.d)(?=.[@#$%^&+=!]).*$\", message = \"Password must contain uppercase,lowercase,number and special caracter")
	private String password;

	@NotBlank(message = "contactNumber is required")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone numbers") // Validates
	private String contactNumber;

	@NotNull(message = "dateOfBirth is required")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
