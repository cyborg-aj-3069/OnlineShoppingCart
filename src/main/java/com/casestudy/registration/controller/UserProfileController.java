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

import com.casestudy.registration.model.UserProfile;
import com.casestudy.registration.service.UserProfileService;
@RestController
@RequestMapping("/user")
public class UserProfileController {
	
	@Autowired
	private UserProfileService profileService;
	
	@PostMapping("/")
	public UserProfile addUser(@RequestBody UserProfile userprofile ) {
		return profileService.addUser(userprofile);
	}
	
	@PutMapping("/")
	public UserProfile updateUser(@RequestBody UserProfile userprofile ) {
		return profileService.updateUser(userprofile);
	}

	@GetMapping("/")
	public  List<UserProfile> getAll() {
		return profileService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<UserProfile> getUser(@PathVariable int id) {
		return profileService.getUser(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		 profileService.deleteUser(id);
	}
	
	
	

}
