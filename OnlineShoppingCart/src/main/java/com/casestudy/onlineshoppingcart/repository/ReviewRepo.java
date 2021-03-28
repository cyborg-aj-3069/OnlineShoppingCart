package com.casestudy.onlineshoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.onlineshoppingcart.model.Review;

@Repository
public interface ReviewRepo extends MongoRepository<Review,Integer> {

}
