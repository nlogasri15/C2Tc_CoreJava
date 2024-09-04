package com.tnsif.sm.orderService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Ordercontroller 
{
@Autowired
private Orderservice service;
@GetMapping("/OrderModule")
public List<OrderModule>list()
{
	return service.listAll();
}
//Retrive Id
@GetMapping("/OrderModule/{id}")
public ResponseEntity <OrderModule> get(@PathVariable Integer id)
{
	try {
		OrderModule order =service.get(id);
		return new ResponseEntity<OrderModule>(order,HttpStatus.OK);
		
	    }
	catch(Exception e)
	{
		return new ResponseEntity<OrderModule>(HttpStatus.NOT_FOUND);
		
	}
}
	
	//Create 
	@PostMapping("/OrderModule")
public void add(@RequestBody OrderModule order)	
{
		service.save(order);
}
	//Ubdate
	@PutMapping("/OrderModule/{id}")
	public ResponseEntity<?>Update(@RequestBody OrderModule order,@PathVariable int id)
	{
		try
		{
			OrderModule existproduct =service.get(id);
			service.save(order);
			return new ResponseEntity<OrderModule>(order,HttpStatus.OK);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<OrderModule>(HttpStatus.NOT_FOUND);
		}
	}
	//delete 
	@DeleteMapping("/OrderModule/{orderId}")
	public void delete(@PathVariable int orderId)
{
	service.delete(orderId);
}
	
	
	
	
	 
	
	
	
	
	
}


