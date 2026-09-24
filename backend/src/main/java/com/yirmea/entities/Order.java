package com.yirmea.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private LocalDateTime commandDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "commandStatus")
    private Status commandStatus;
    private BigDecimal totalAmount;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orderline> orderlines = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    User user;
}
