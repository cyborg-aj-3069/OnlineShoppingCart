package com.casestudy.onlineshoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Review")
public class Review {
	
	@Id
	private int id;
	private String Reviewername;
	private String Reviewertype;
	private String ReviewerEmail;
	private String ReviewerContact;
	private String Review;

	public Review() {
	}

	public Review(int id, String reviewername, String reviewertype, String reviewerEmail, String reviewerContact, String review) {
		this.id = id;
		Reviewername = reviewername;
		Reviewertype = reviewertype;
		ReviewerEmail = reviewerEmail;
		ReviewerContact = reviewerContact;
		Review = review;
	}

	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReviewername() {
		return Reviewername;
	}
	public void setReviewername(String reviewername) {
		Reviewername = reviewername;
	}
	public String getReviewertype() {
		return Reviewertype;
	}
	public void setReviewertype(String reviewertype) {
		Reviewertype = reviewertype;
	}
	public String getReviewerEmail() {
		return ReviewerEmail;
	}
	public void setReviewerEmail(String reviewerEmail) {
		ReviewerEmail = reviewerEmail;
	}
	public String getReviewerContact() {
		return ReviewerContact;
	}
	public void setReviewerContact(String reviewerContact) {
		ReviewerContact = reviewerContact;
	}
	@Override
	public String toString() {
		return "Review [id=" + id
				+ ", Reviewername=" + Reviewername
				+ ", Reviewertype=" + Reviewertype
				+ ", ReviewerEmail=" + ReviewerEmail
				+ ", ReviewerContact=" + ReviewerContact
				+ ", Review=" + Review
				+ "]";
	}
	
	
	
}
