package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.*;
import com.example.demo.repo.CustomerRepo;
import com.example.*;
import com.example.demo.service.*;
import com.fis.demo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		if(customerRepo.existsByUsername(customer.getUsername()));
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer c =customerRepo.findByUsername(customer.getUsername());
		if(c.equals(null)) 
		customer.setCustomerId(c.getCustomerId());
		return customerRepo.save(customer);
	}

	@Override
	public String deleteCustomer(Long customerId) {
		if(!customerRepo.existsById(customerId));
		customerRepo.deleteById(customerId);
		return "delete thành công";
		
	}

	@Override
	public Customer findById(Long customerId) {
		if(!customerRepo.existsById(customerId));
		return customerRepo.findById(customerId).get();
	}


}
