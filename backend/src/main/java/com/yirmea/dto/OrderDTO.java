package com.yirmea.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private LocalDateTime commandDate;
    private String commandStatus;
    private BigDecimal totalAmount;
}
