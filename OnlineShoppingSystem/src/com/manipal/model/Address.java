package com.manipal.model;



public class Address 
{
	private String address_Id;
	private String address;
	private String status;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	public Address() {
		super();
	}

	public String getStatus() {
		return status;
	}

	

	public void setStatus(String status) {
		this.status = status;
	}

	public Address(String address_Id, String address2, String city2, String state2, String country2, String status) {
		super();
		this.address_Id = address_Id;
		this.address = address2;
		this.city=city2;
		this.state = state2;
		this.country = country2;
		this.status = status;
	}
	
	
	public Address(String address,String city,String state,String country, String zip)
	{
		this.address=address;
		this.city=city;
		this.state=state;
		this.country=country;
		this.zipcode=zip;
	}
	
	public String getAddress_Id() {
		return address_Id;
	}
	public void setAddress_Id(String address_Id) {
		this.address_Id = address_Id;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
