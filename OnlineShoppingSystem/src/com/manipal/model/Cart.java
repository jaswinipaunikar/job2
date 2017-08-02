package com.manipal.model;

public class Cart {

			
			private String cart_Id;
			private String total_price;
			private String product_Id;
		//	private String Customer_Id;
			
			
			public Cart() {
				super();
			
			}

			public Cart(String cart_Id,String product_Id, String total_price) {
				super();
				this.cart_Id = cart_Id;
				this.total_price = total_price;
				this.product_Id = product_Id;
				//sCustomer_Id = customer_Id;
			}
			
			public Cart(String pdtid, String quantity) {
				// TODO Auto-generated constructor stub
				this.product_Id=pdtid;
				this.total_price=quantity;
			}
/*
			public Cart(String pdtid, String p) {
				this.Product_Id=pdtid;
				this.total_price=p;
				//this.Customer_Id = customerId;
				
			}*/

			public String getCart_Id() {
				return cart_Id;
			}
			public void setCart_Id(String cart_Id) {
				this.cart_Id = cart_Id;
			}
			public String gettotal_price() {
				return total_price;
			}
			public void settotal_price(String total_price) {
				total_price = total_price;
			}

			public String getTotal_price() {
				return total_price;
			}

			public void setTotal_price(String total_price) {
				this.total_price = total_price;
			}

			public String getProduct_Id() {
				return product_Id;
			}

			public void setProduct_Id(String product_Id) {
				this.product_Id = product_Id;
			}
		
			/*public String getCustomer_Id() {
				return Customer_Id;
			}
			public void setCustomer_Id(String customer_Id) {
				Customer_Id = customer_Id;
			}
			*/
			
}