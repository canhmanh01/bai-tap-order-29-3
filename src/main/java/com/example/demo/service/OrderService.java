package com.example.demo.service;

import com.fis.demo.entity.*;

public interface OrderService {
	Order addOrder(Order order);

	Order updateOrderProduct(Order order);

	void deleteOrder(Long orderId);

}
