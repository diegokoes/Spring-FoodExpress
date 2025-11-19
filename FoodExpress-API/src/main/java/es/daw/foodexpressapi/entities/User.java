package es.daw.foodexpressapi.entities;

import jakarta.persistence.*;

import java.math.BigInteger;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String fullName;

    private String email;

    @OneToMany(fetch = FetchType.EAGER)
    private Role role;
}
