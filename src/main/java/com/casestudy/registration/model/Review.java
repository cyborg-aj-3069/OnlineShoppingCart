package com.casestudy.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Review")
public class Review {
	
	@Id
	private int id;
	private String Reviewername;
	private String Reviewertype;
	private String ReviewerEmail;
	private String ReviewerContact;
	private String Review;


	
	
	
}
