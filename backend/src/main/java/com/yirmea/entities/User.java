package com.yirmea.entities;

import jakarta.persistence.*;
import lombok.Data;

import javax.management.relation.Role;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Entity(name = "users")
@Data
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mail")
    private String email;
    private String password;
    private String name;
    private LocalDateTime dateCreation;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @OneToOne
    private Client client;
    @OneToOne
    Cart cart;
    @OneToMany
    private List<Order> orders = new ArrayList<>();
}
