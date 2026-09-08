package com.yirmea.dao;

import com.yirmea.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
