package com.casestudy.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.registration.model.Review;

@Repository
public interface ReviewRepo extends MongoRepository<Review,Integer> {

}
