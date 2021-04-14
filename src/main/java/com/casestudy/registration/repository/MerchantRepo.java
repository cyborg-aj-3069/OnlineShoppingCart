package com.casestudy.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.registration.model.Merchant;

@Repository
public interface MerchantRepo extends MongoRepository<Merchant,Integer>  {

}
