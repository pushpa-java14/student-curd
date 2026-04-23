package com.atlas.studentservice.repository.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class represents student table in the database
 */
@Entity // entity annotation marks this class as JPA entity
@Table(name = "STUDENT_TL") // maps entity to STUDENT_TL TABLE
public class StudentEntity {
	@Id // marks primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // using for auto increment
	private Long studentID; // unique identification for user
	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstName;
	@Column(name = "LAST_NAME", length = 50, nullable = false)
	private String lastName;
	@Column(name = "EMAIL_ID", length = 100, nullable = false)
	private String emailId;
	@Column(name = "CONTACTNUMBER", length = 10, nullable = false)
	private String contactNumber;
	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private Date dateOfBirth;

	public Long getUserID() {
		return studentID;
	}

	public void setUserID(Long userID) {
		this.studentID = userID;
	}

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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
