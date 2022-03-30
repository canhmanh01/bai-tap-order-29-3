package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.demo.entity.Order;

public interface OrderRepo extends JpaRepository<Order,Long > {

}
