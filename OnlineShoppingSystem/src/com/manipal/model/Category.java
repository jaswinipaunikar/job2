package com.manipal.model;

import javax.annotation.Generated;

public class Category {
	
	private String category_Id;
	private String category_Name;
	private String description ;
	private String status="active";
	

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Category(String category_Id, String category_Name,
			String description) {
		super();
		this.category_Id = category_Id;
		this.category_Name = category_Name;
		this.description = description;
		
	}
	

	public Category(String category_Id, String category_Name,
			String description, String status) {
		super();
		this.category_Id = category_Id;
		this.category_Name = category_Name;
		this.description = description;
		this.status = status;
	}

	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public String getCategory_Name() {
		return category_Name;
	}

	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}

	
	
	public String getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(String category_Id) {
		this.category_Id = category_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFirst_name() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
