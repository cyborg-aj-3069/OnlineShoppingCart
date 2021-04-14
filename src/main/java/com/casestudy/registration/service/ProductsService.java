package com.casestudy.registration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.registration.model.Products;
import com.casestudy.registration.repository.ProductsRepo;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepo productsRepo;

	public List<Products> getAll() {
		return productsRepo.findAll();
	}

	public Products addProducts(Products products) {
		return productsRepo.insert(products);
	}

	public Products updateProducts(Products  products) {
		return productsRepo.save( products);
	}

	public void deleteProducts(int id) {
		productsRepo.deleteById(id);
	}

	public Optional<Products> getProducts(@PathVariable int id) { return productsRepo.findById(id); }

}
