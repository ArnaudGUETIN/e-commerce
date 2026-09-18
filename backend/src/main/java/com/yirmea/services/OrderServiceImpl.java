package com.yirmea.services;

import com.yirmea.dto.OrderDTO;
import com.yirmea.entities.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderServiceImpl implements OrderService{
    @Override
    public OrderDTO addOrder(Order order) {
        return null;
    }

    @Override
    public OrderDTO addOrder(LocalDateTime commandDate, String commandStatus, BigDecimal totalAmount) {
        return null;
    }
}
