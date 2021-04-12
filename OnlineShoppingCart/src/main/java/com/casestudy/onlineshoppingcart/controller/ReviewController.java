package com.casestudy.onlineshoppingcart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.onlineshoppingcart.model.Review;
import com.casestudy.onlineshoppingcart.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@PostMapping("/")
	public Review addReview(@RequestBody Review review){
		return reviewService.addReview(review);
	}
	
	@PutMapping("/")
	public Review updateReview(@RequestBody Review review){
		return reviewService.updateReview(review);
	}
	
	@GetMapping("/")
	public List<Review> getAll(){
		return reviewService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Review> getReview(@PathVariable int id){
		 return reviewService.getReview(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReview(@PathVariable int id){
		 reviewService.deleteReview(id);
	}

}
