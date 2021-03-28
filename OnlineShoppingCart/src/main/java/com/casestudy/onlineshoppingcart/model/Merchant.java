package com.casestudy.onlineshoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Merchant")
public class Merchant {
	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private Address address;
	private Float   income;
	
	
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Merchant(String firstname, String lastname, Address address, Float income) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.income = income;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Float getIncome() {
		return income;
	}


	public void setIncome(Float income) {
		this.income = income;
	}
	
	

}
