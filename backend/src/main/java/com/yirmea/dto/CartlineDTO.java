package com.yirmea.dto;

import com.yirmea.entities.Item;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartlineDTO {
    BigDecimal unitPrice;
    BigDecimal quantity;
    BigDecimal getUnitPrice(Item item) {
        return item.getPrice();
    }
}
