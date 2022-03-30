package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.demo.entity.*;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
	boolean existsByUsername(String username);

	Optional<Customer> findById(Long customerId);

	Customer findByUsername(String username);
}
