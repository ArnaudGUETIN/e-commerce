package com.yirmea.services;

import com.yirmea.dao.CartRepository;
import com.yirmea.dto.CartDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Cartline;
import com.yirmea.entities.Orderline;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public CartDTO addCart(Cart cart) {
        return mapCartToCartDTO(this.cartRepository.save(cart));
    }


    @Override
    public CartDTO clearCart(List<Cartline> cartlines) {
        return null;
    }

    @Override
    public CartDTO totalAmount(List<Cartline> cartlines) {
        return null;
    }

    @Override
    public CartDTO confirmCart(Cart cart) {
        return null;
    }

    public CartDTO mapCartToCartDTO(Cart cart){
        CartDTO cartDTO = new CartDTO();
        cartDTO.setCreationDate(cart.getCreationDate());
        return cartDTO;
    }
}
