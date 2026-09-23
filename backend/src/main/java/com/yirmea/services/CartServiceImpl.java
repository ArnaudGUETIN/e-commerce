package com.yirmea.services;

import com.yirmea.dto.CartDTO;
import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Cartline;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CartServiceImpl implements CartService {


    @Override
    public CartDTO addItemToCart(Long user_id, Long item_id) {
        return null;
    }

    @Override
    public CartDTO createCart(LocalDateTime creationDate, BigDecimal total) {
        return null;
    }

    @Override
    public CartDTO createCart(Cart cart) {
        return null;
    }

    @Override
    public CartlineDTO createCartline(Cartline Cartline) {
        return null;
    }

    @Override
    public CartlineDTO createCartline(int amount, Long cart_id, Long item_id) {
        return null;
    }

    @Override
    public CartlineDTO updateCartlineAmount(Long cartline_id, int amount) {
        return null;
    }

    @Override
    public CartlineDTO removeCartline(Long cartline_id) {
        return null;
    }

    @Override
    public boolean removeCart(Long id) {
        return false;
    }

    @Override
    public List<CartDTO> getAllCartlines() {
        return List.of();
    }
}
