package com.saikat.product.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_profile_jpa")
public class UserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="user_phone_number")
	private String phoneNumber;
	@Column(name="user_address")
	private String address;
	@Enumerated(EnumType.STRING)
	@Column(name="user_gender")
	private Gender gender;
	
	@Column(name="Date_of_birth")
	private LocalDate birthOfDate;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="userProfile")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserProfile() {
		
	}

	public UserProfile(String phoneNumber, String address, Gender gender, LocalDate birthOfDate) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.birthOfDate = birthOfDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}


	
	

}
