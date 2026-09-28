package com.yirmea.dto;

import com.yirmea.entities.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private String imageUrl;
    Long categoryId;
}
