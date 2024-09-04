package com.tnsif.sm.orderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Orderservice {
	@Autowired
	private OrderRepository repo;
	public List<OrderModule>listAll()
	{
		return repo.findAll();
	}
	public OrderModule get(Integer id)
	{
		return repo.findById(id).get();
	
	}
	public void save(OrderModule order)
	{
		 repo.save(order);
	}
	public void delete(int orderId)
	{
		
		repo.deleteById(orderId);
	}
}