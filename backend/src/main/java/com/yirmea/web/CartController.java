package com.yirmea.web;

import com.yirmea.dto.CartDTO;
import com.yirmea.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public CartDTO getCart(@PathVariable("id") Long id){
        return this.cartService.getCart(id);
    }
}
