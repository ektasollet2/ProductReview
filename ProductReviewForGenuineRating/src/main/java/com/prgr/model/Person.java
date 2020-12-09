package com.prgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_ID")
	private int personId;
	@Column(name = "PERSON_FIRST_NAME")
	private String firstName;
	@Column(name = "PERSON_LAST_NAME")
	private String lastName;
	@Column(name = "PERSON_ADDRESS")
	private String address;
	@Column(name = "PERSON_PHONE")
	private Long phoneNumber;
	@Column(name = "PERSON_EMAIL_ID")
	private String emailId;
	@Column(name = "PERSON_PASSWORD")
	private String password;
	@Column(name = "PERSON_ROLE")
	private String role;

	public Person() {

	}

	

	public Person(int personId, String firstName, String lastName,
			String address, Long phoneNumber, String emailId, String password,
			String role) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}



	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long i) {
		this.phoneNumber = i;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", role=" + role + "]";
	}

}
