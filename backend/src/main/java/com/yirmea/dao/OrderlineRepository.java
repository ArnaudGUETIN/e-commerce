package com.yirmea.dao;

import com.yirmea.entities.Orderline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderlineRepository extends JpaRepository<Orderline, Long> {
}
