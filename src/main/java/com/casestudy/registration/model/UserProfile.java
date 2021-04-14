package com.casestudy.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("UserProfile")
public class UserProfile {
	
	@Id
	private int id;
	private String username;
	private String usertype;
	private String useremail;
	private String usercontact;
	private String password;
	
}
