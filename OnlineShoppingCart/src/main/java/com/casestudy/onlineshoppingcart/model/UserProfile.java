package com.casestudy.onlineshoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("UserProfile")
public class UserProfile {
	
	@Id
	private int id;
	private String username;
	private String usertype;
	private String useremail;
	private String usercontact;

	public UserProfile() {
	}

	public UserProfile(int id, String username, String usertype, String useremail, String usercontact) {
		this.id = id;
		this.username = username;
		this.usertype = usertype;
		this.useremail = useremail;
		this.usercontact = usercontact;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsercontact() {
		return usercontact;
	}
	public void setUsercontact(String usercontact) {
		this.usercontact = usercontact;
	}
	
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", username=" + username + ", usertype=" + usertype + ", useremail="
				+ useremail + ", usercontact=" + usercontact + "]";
	}
	
	
}
