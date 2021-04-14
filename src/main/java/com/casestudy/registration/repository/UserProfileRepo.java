package com.casestudy.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.registration.model.UserProfile;


@Repository
public interface UserProfileRepo extends MongoRepository<UserProfile,Integer>{


}
