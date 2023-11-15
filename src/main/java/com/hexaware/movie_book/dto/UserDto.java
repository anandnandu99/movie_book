package com.hexaware.movie_book.dto;

public class UserDTO {
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Long phoneNumber;
	private String address;
	private String city;
	private String state;
	private double zipCode;


	public UserDTO() {
		
	}


	public UserDTO(Long userId, String firstName, String lastName, String email, String password,
			Long phoneNumber, String address, String city, String state, double zipCode) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public double getZipCode() {
		return zipCode;
	}


	public void setZipCode(double zipCode) {
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		return "UserCustomers [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}


	

}


