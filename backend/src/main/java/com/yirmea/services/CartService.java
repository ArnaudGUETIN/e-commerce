package com.yirmea.services;

import com.yirmea.dto.CartDTO;
import com.yirmea.entities.Cart;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface CartService {
    CartDTO addItemToCart(Long user_id);
    CartDTO addCart(LocalDateTime creationDate, BigDecimal total);
    boolean removeCart(Long id);
    List<CartDTO> getAllCarts();
}
