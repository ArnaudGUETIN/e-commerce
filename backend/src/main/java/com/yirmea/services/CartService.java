package com.yirmea.services;

import com.yirmea.dto.CartDTO;
import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Cartline;
import com.yirmea.entities.Item;
import com.yirmea.entities.Orderline;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface CartService {
    CartDTO addCart(Cart cart);
    CartDTO addItemToCart(Long id);
    CartDTO clearCart(List<Orderline> orderlines);
    CartDTO totalAmount(List<Orderline> orderlines);
    CartDTO confirmCart(Cart cart);
}


