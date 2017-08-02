package com.manipal.model;

import java.io.InputStream;

public class Product {
	private String product_Id;
	private String product_Name;
	private String desc;
	private double price;
	private String status; 
	private String product_Image_Url;
	private InputStream product_Image;
	private String category_Id;
	private String supplier_Id;
	
	
	public Product(String product_Id, String product_Name, String desc,
			double price, String status, String product_Image_Url,
			InputStream product_Image, String category_Id, String supplier_Id) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.desc = desc;
		this.price = price;
		this.status = status;
		this.product_Image_Url = product_Image_Url;
		this.product_Image = product_Image;
		this.category_Id = category_Id;
		this.supplier_Id = supplier_Id;
	}

	public String getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(String category_Id) {
		this.category_Id = category_Id;
	}

	public String getSupplier_Id() {
		return supplier_Id;
	}

	public void setSupplier_Id(String supplier_Id) {
		this.supplier_Id = supplier_Id;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return "Product [product_Id=" + product_Id + ", product_Name="
				+ product_Name + ", desc=" + desc + ", price=" + price
				+ ", status=" + status + "]";
	}


	public Product(String product_Id, String product_Name, String desc,
			double price, String status,String product_Image_Url,InputStream product_Image) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.desc = desc;
		this.price = price;
		this.status = status;
		this.product_Image = product_Image;
	}
	

	public Product(String product_Name, String desc, Double price) {
		this.product_Name = product_Name;
		this.desc = desc;
		this.price = price;
		
	}


	public Product(String product_Id, String product_Name,
			String desc, Double price,
			String status) {
		
		this.product_Name = product_Name;
		this.desc = desc;
		this.price = price;
		this.status=status;
		
		
	}

	public Product(String product_Id, String product_Name,
			String desc, Double price,
			String status, String category_Id, String supplier_Id) {
		this.product_Id=product_Id;
		this.product_Name = product_Name;
		this.desc = desc;
		this.price = price;
		this.status=status;
	
	
	}

	public Product(String product_Id2, String product_Name2,
			String description, Double price2) {
		this.product_Id=product_Id2;
		this.product_Name = product_Name2;
		this.desc = description;
		this.price = price2;
		
	}

	


	public Product(String product_Name) {
	this.product_Name=product_Name;
	}


	public String getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProduct_Image_Url() {
		return product_Image_Url;
	}

	public void setProduct_Image_Url(String product_Image_Url) {
		this.product_Image_Url = product_Image_Url;
	}

	public InputStream getProduct_Image() {
		return product_Image;
	}
	
	public void setProduct_Image(InputStream product_Image) {
		this.product_Image = product_Image;
	}
	
	
	

}
