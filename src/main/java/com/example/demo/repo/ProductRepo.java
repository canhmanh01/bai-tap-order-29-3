package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.demo.entity.*;

public interface ProductRepo extends JpaRepository<Product, Long> {
	boolean existsByName(String name);

	Product findByName(String name);

}
