package com.yirmea.dao;

import com.yirmea.entities.Cartline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartLineRepository extends JpaRepository<Cartline,Long> {
}
