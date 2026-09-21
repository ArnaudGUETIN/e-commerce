package com.yirmea.services;

import com.yirmea.dao.OrderRepository;
import com.yirmea.dto.OrderDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderDTO addOrder(Order order) {
        return mapOrderToOrderDTO(this.orderRepository.save(order));
    }

    @Override
    public OrderDTO addOrder(LocalDateTime commandDate, String commandStatus, BigDecimal totalAmount) {
        Order order = new Order();
        order.setCommandDate(commandDate);
        order.setCommandStatus(commandStatus);
        order.setTotalAmount(totalAmount);
        return this.addOrder(order);
    }

    @Override
    public OrderDTO updateOrder(Long id, LocalDateTime commandDate, String commandStatus, BigDecimal totalAmount) {
        Order order = this.orderRepository.getReferenceById(id);
        order.setCommandDate(commandDate);
        order.setCommandStatus(commandStatus);
        order.setTotalAmount(totalAmount);
        return mapOrderToOrderDTO(this.orderRepository.save(order));
    }

    @Override
    public boolean removeOrder(Long id) {
        this.orderRepository.deleteById(id);
        return true;
    }


    @Override
    public List<OrderDTO> getAllOrders() {
        List<Order> all = this.orderRepository.findAll();
        List<OrderDTO> orderDTOS = new ArrayList<>();
        for (Order c : all){
            orderDTOS.add(mapOrderToOrderDTO(c));
        }
        return orderDTOS;
    }

    public OrderDTO mapOrderToOrderDTO(Order o){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCommandDate(o.getCommandDate());
        orderDTO.setCommandStatus(o.getCommandStatus());
        orderDTO.setTotalAmount(o.getTotalAmount());
        return orderDTO;
    }
}
