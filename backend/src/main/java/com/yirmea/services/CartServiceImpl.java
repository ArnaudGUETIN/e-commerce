package com.yirmea.services;

import com.yirmea.dto.CartDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CartServiceImpl implements CartService {
    @Override
    public CartDTO addItemToCart(Long user_id) {
        return null;
    }

    @Override
    public CartDTO addCart(LocalDateTime creationDate, BigDecimal total) {
        return null;
    }

    @Override
    public boolean removeCart(Long id) {
        return false;
    }

    @Override
    public List<CartDTO> getAllCarts() {
        return List.of();
    }
}
