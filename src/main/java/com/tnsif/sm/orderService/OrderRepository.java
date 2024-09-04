package com.tnsif.sm.orderService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModule,Integer>
{

}
