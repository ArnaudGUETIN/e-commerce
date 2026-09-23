package com.yirmea.services;

import com.yirmea.dto.CartDTO;
import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Cartline;
import com.yirmea.entities.Item;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface CartService {
    CartDTO addItemToCart(Long user_id, Long item_id);
    CartDTO createCart(LocalDateTime creationDate, BigDecimal total);
    CartDTO createCart(Cart cart);
    CartlineDTO createCartline(Cartline Cartline);
    CartlineDTO createCartline( int amount,Long cart_id,Long item_id);
    CartlineDTO updateCartlineAmount(Long cartline_id, int amount);
    CartlineDTO removeCartline(Long cartline_id);
    boolean removeCart(Long id);
    List<CartDTO> getAllCartlines();
}
