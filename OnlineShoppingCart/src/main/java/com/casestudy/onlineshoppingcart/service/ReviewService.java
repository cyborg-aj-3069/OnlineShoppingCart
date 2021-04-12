package com.casestudy.onlineshoppingcart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.onlineshoppingcart.model.Review;
import com.casestudy.onlineshoppingcart.repository.ReviewRepo;

@Service
public class ReviewService {
	

	@Autowired
	private ReviewRepo reviewRepo;

	public List<Review> getAll() {
		return reviewRepo.findAll();
	}

	public Review addReview(Review review) {
		return reviewRepo.insert(review);
	}

	public Review updateReview(Review review) {
		return reviewRepo.save(review);
	}

	public void deleteReview(int id) {
		reviewRepo.deleteById(id);
	}

	public Optional<Review> getReview(@PathVariable int id) {
		return reviewRepo.findById(id);
	}

}
