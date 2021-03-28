package com.casestudy.onlineshoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Products")
public class Products {

	@Id
	private int id;
	private String productName;
	private String productCategory;
	private String productQty;
	private String productCompany;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductQty() {
		return productQty;
	}
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	@Override
	public String toString() {
		return "Products [productId=" + id + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productQty=" + productQty + ", productCompany=" + productCompany + "]";
	}
	
}
