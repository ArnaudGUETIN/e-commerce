package com.yirmea.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private long orderId;
    private LocalDateTime commandDate;
    private String commandStatus;
    private BigDecimal totalAmount;

}
