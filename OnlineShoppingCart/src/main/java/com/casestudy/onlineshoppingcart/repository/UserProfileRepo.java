package com.casestudy.onlineshoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.onlineshoppingcart.model.UserProfile;
@Repository
public interface UserProfileRepo extends MongoRepository<UserProfile,Integer>{


}
