package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import com.fis.demo.entity.*;
@Data
public class OrderDto {
	private Customer customer;
	private Date createDate;
	private Double totalPrice;
	private List<OrderRow> lstOrderRow;
}
