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

import com.casestudy.onlineshoppingcart.model.Products;
import com.casestudy.onlineshoppingcart.service.ProductsService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductsService productsService;
	
	@PostMapping("/")
	public Products addProduct(@RequestBody Products product ) {
		return productsService.addProducts(product);
	}
	
	@PutMapping("/")
	public Products updateProduct(@RequestBody Products products){
		return productsService.updateProducts(products);
	}

	@GetMapping("/")
	public  List<Products> getProducts() {
		return productsService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Products> getProduct(@PathVariable int id) {
		return productsService.getProducts(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
		productsService.deleteProducts(id);

	}
	
}
