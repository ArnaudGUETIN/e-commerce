package com.yirmea.services;

import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cartline;

import java.math.BigDecimal;

public interface CartlineService {
    CartlineDTO addCartline(Cartline cartline);
    CartlineDTO addCartline(Long id, BigDecimal quantity);
    CartlineDTO updateQuantity(Long id);
    CartlineDTO deleteCartline(Long id);
    CartlineDTO getAllCartlines(Long id);
}
