package com.casestudy.onlineshoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.onlineshoppingcart.model.Merchant;

@Repository
public interface MerchantRepo extends MongoRepository<Merchant,Integer>  {

}
