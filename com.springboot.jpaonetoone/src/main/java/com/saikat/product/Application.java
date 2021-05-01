package com.saikat.product;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saikat.product.model.Gender;
import com.saikat.product.model.User;
import com.saikat.product.model.UserProfile;
import com.saikat.product.model.repository.UserProfileRepository;
import com.saikat.product.model.repository.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserProfileRepository userProfileRepo;
	@Override
	public void run(String...args) throws Exception{
		
		//create new user
		
		User user1 = new User();
		user1.setName("Michael");
		user1.setEmail("mich@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Arlington");
		userProfile.setBirthOfDate(LocalDate.of(1992, 11, 19));
		userProfile.setPhoneNumber("7895568566");
		userProfile.setGender(Gender.MALE);
		
		user1.setUserProfile(userProfile);
		userProfile.setUser(user1);
		
		userRepo.save(user1);
		
	}
}
