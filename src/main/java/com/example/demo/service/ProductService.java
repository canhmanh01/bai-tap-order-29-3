package com.example.demo.service;

import com.fis.demo.entity.*;

public interface ProductService {
	Product addProduct(Product product);

	Product updateProduct(Product product);

	String deleteProduct(Long productId);

	Product findById(Long productId);
}
