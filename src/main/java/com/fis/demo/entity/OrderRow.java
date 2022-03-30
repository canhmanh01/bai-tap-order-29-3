package com.fis.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orderrow")
public class OrderRow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderRowId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private Order orderProduct;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;

	private Integer number;

	public Long getOrderRowId() {
		return orderRowId;
	}

	public void setOrderRowId(Long orderRowId) {
		this.orderRowId = orderRowId;
	}

	public Order getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(Order orderProduct) {
		this.orderProduct = orderProduct;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
