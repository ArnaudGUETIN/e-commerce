package com.yirmea.services;

import com.yirmea.dto.OrderDTO;
import com.yirmea.entities.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderService{
    OrderDTO addOrder(Order order);
    OrderDTO addOrder(LocalDateTime commandDate, String commandStatus, BigDecimal totalAmount);
}
