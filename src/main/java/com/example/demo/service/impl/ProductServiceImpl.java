package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.demo.entity.*;
import com.example.demo.repo.*;
import com.example.demo.service.*;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public Product addProduct(Product product) {
		if (productRepo.existsByName(product.getName()))
			;
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		if (!productRepo.existsByName(product.getName()))
			;
		return productRepo.save(product);
	}

	@Override
	public String deleteProduct(Long productId) {
		if (!productRepo.existsById(productId))
			;
		productRepo.deleteById(productId);
		return "delete san pham ";
	}

	@Override
	public Product findById(Long productId) {
		return productRepo.findById(productId).orElse(null);
	}

}
