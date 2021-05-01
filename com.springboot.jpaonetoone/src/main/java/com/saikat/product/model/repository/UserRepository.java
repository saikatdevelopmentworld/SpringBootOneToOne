package com.saikat.product.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saikat.product.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
