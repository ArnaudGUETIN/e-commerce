package com.yirmea.services;

import com.yirmea.dao.CartLineRepository;
import com.yirmea.dto.CartlineDTO;
import com.yirmea.entities.Cartline;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class CartlineServiceImpl implements CartlineService{
    @Autowired
    CartLineRepository cartLineRepository;

    @Override
    public CartlineDTO addCartline(Cartline cartline) {
        return cartlineMapper(this.cartLineRepository.save(cartline));
    }

    @Override
    public CartlineDTO addCartline(Long id, BigDecimal quantity) {
        Cartline cartline = new Cartline();
        return null;
    }

    @Override
    public CartlineDTO updateQuantity(Long id) {
        return null;
    }

    @Override
    public CartlineDTO deleteCartline(Long id) {
        return null;
    }

    @Override
    public CartlineDTO getAllCartlines(Long id) {
        return null;
    }

    public CartlineDTO cartlineMapper(Cartline cartline){
        CartlineDTO cartlineDTO = new CartlineDTO();
        cartlineDTO.setUnitPrice(cartline.getUnitPrice());
        cartlineDTO.setQuantity(cartline.getQuantity());
        return cartlineDTO;
    }
}
