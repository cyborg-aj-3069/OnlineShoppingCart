package com.casestudy.registration.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.registration.model.UserProfile;
import com.casestudy.registration.repository.UserProfileRepo;

@Service
public class UserProfileService {
	
	@Autowired
	UserProfileRepo profileRepo;
	
	public List<UserProfile> getAll() {
		return profileRepo.findAll();
	}

	public UserProfile addUser(UserProfile profile) {
		return profileRepo.insert(profile);
	}

	public UserProfile updateUser(UserProfile profile) {
		return profileRepo.save(profile);
	}

	public void deleteUser(int id) {
		profileRepo.deleteById(id);
	}

	public Optional<UserProfile> getUser(@PathVariable int id) {
		return profileRepo.findById(id);
	}


}
