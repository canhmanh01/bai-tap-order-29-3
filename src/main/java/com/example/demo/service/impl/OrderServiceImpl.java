package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.*;
import com.fis.demo.entity.*;
import com.example.demo.repo.*;
import com.example.demo.repo.OrderRepo;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.*;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepo orderRepo;

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	ProductRepo productRepo;

	@Override
	public Order addOrder(Order order) {
		if (order.getOrderId() != null)
			;
		Customer customer = customerRepo.findByUsername(order.getCustomer().getUsername());
		if (customer == null)
			;
		List<OrderRow> lst = order.getLstOrderRow();
		Double totalPrice = 0.0;
		for (OrderRow orderRow : lst) {
			Product product = productRepo.findByName(orderRow.getProduct().getName());
			if (product == null)
				;
			orderRow.setProduct(product);
			totalPrice += product.getPrice() * orderRow.getNumber();
		}
		order.setLstOrderRow(lst);
		order.setTotalPrice(totalPrice);
		order.setCustomer(customer);
		order.setCreateDate(new Date());
		return orderRepo.save(order);
	}

	@Override
	public Order updateOrderProduct(Order order) {
		if (order.getOrderId() == null)
			;
		Customer customer = customerRepo.findByUsername(order.getCustomer().getUsername());
		if (customer == null)
			;
		List<OrderRow> lst = order.getLstOrderRow();
		Double totalPrice = 0.0;
		for (OrderRow orderRow : lst) {
			Product product = productRepo.findByName(orderRow.getProduct().getName());
			if (product == null)
				return null;
			orderRow.setProduct(product);
			totalPrice += product.getPrice() * orderRow.getNumber();
		}
		order.setLstOrderRow(lst);
		order.setTotalPrice(totalPrice);
		order.setCustomer(customer);
		order.setCreateDate(new Date());
		return orderRepo.save(order);
	}

	@Override
	public void deleteOrder(Long orderId) {
		orderRepo.deleteById(orderId);

	}

}
