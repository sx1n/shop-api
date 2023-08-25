package com.sx1n.shop.repositories;

import com.sx1n.shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository anotação opcional se já estiver herdando de JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}
