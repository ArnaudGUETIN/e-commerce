package com.yirmea.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cartline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal unitPrice;
    @Column(updatable = false)
    private BigDecimal quantity;
    @OneToOne(fetch = FetchType.LAZY)
    private Item item;
    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;
    public BigDecimal getUnitPrice() {

        return item.getPrice();
    }
    public int getStock(){
        return item.getStock();
    }
}

