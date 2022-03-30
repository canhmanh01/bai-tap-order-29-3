package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.fis.demo.entity.*;

public interface CustomerService {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	String deleteCustomer(Long customerId);

	Customer findById(Long customerId);
}
