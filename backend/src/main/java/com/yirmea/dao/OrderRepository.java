package com.yirmea.dao;

import com.yirmea.dto.OrderDTO;
import com.yirmea.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
