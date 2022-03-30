package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.demo.entity.*;

public interface OrderRowRepo extends JpaRepository<OrderRow, Long>{

}
