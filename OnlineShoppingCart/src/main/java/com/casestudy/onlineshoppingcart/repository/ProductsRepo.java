package com.casestudy.onlineshoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.onlineshoppingcart.model.Products;

@Repository
public interface ProductsRepo extends MongoRepository<Products,Integer> {

}
