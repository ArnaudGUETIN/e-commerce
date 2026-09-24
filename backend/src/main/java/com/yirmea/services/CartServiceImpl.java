package com.yirmea.services;

import com.yirmea.dao.CartRepository;
import com.yirmea.dto.CartDTO;
import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Cartline;
import com.yirmea.entities.Orderline;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public CartDTO addCart(Cart cart) {
        return null;
    }

    @Override
    public CartDTO addItemToCart(Long id) {
        return null;
    }

    @Override
    public CartDTO clearCart(List<Orderline> orderlines) {
        return null;
    }

    @Override
    public CartDTO totalAmount(List<Orderline> orderlines) {
        return null;
    }

    @Override
    public CartDTO confirmCart(Cart cart) {
        return null;
    }
}
