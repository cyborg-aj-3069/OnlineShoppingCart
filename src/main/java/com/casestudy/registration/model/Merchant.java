package com.casestudy.registration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Merchant")
public class Merchant {
	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private Address address;
	private Double   income;


}
