package com.casestudy.registration.controller;

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

import com.casestudy.registration.model.Merchant;
import com.casestudy.registration.service.MerchantService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	@Autowired
	private MerchantService merchantService;
	
	@PostMapping("/")
	public Merchant addMerchant(@RequestBody Merchant merchant){
		return merchantService.addMerchant(merchant);
	}
	
	@PutMapping("/")
	public Merchant updateMerchant(@RequestBody Merchant merchant){
		return merchantService.updateMerchant(merchant);
	}
	
	@GetMapping("/")
	public List<Merchant> getAll(){
		return merchantService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Merchant> getMerchant(@PathVariable int id){
		 return merchantService.getMerchant(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMerchant(@PathVariable int id){
		 merchantService.deleteMerchant(id);
	}

}
