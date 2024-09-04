package com.tnsif.sm.orderService;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class OrderModule 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	private int customerId;
	private int storeId;
	private Date orderDate;
	private double totalPrice;
	private String status;
	
	public OrderModule() {
		
	}
	
	
	
	public OrderModule(int orderId, int customerId, int storeId, Date orderDate, double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.storeId = storeId;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.status = status;
	}



	public int getOrderId() {
		return orderId;
	}


	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public int getStoreId() {
		return storeId;
	}



	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}
