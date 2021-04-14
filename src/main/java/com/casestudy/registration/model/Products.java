package com.casestudy.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Products")
public class Products {

	@Id
	private int id;
	private String productName;
	private String productCategory;
	private String productQty;
	private String productCompany;

		
}
