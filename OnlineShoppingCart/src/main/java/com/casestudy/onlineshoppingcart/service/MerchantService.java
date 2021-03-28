package com.casestudy.onlineshoppingcart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.onlineshoppingcart.model.Merchant;
import com.casestudy.onlineshoppingcart.repository.MerchantRepo;

@Service
public class MerchantService {

	@Autowired
	private MerchantRepo merchantRepo;

	public List<Merchant> getAll() {
		return merchantRepo.findAll();
	}

	public Merchant addMerchant(Merchant merchant) {
		return merchantRepo.insert(merchant);
	}

	public Merchant updateMerchant(Merchant merchant) {
		return merchantRepo.save(merchant);
	}

	public void deleteMerchant(int id) {
		merchantRepo.deleteById(id);
	}

	public Optional<Merchant> getUser(@PathVariable int id) {
		return merchantRepo.findById(id);
	}

}
