package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.addCustomer(customer));
	}

	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.updateCustomer(customer));
	}

	@GetMapping("/delete/{customerId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable Long customerId) {
		return ResponseEntity.ok(customerService.deleteCustomer(customerId));
	}

	@GetMapping("/findById/{customerId}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable Long customerId) {
		return ResponseEntity.ok(customerService.findById(customerId));
	}
}
