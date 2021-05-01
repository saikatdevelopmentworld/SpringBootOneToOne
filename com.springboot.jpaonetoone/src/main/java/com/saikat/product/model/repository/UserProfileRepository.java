package com.saikat.product.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saikat.product.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
