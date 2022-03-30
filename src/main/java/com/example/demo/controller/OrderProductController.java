package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;
import com.fis.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/order")
public class OrderProductController {
	@Autowired
	OrderService orderService;

	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.addOrder(order));
	}

	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.updateOrderProduct(order));
	}

	@GetMapping("/delete/{orderId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable Long orderId) {
		orderService.deleteOrder(orderId);
		return ResponseEntity.ok("Thanh Cong");
	}

}
