package com.yirmea.entities;

import jakarta.persistence.*;
import lombok.Data;


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
    @OneToOne
    private Role role;
}
