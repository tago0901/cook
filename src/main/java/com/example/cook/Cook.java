package com.example.cook;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cook")
public class Cook {
    @Id
    @Column(name = "cook_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cookCode;

    @Column(name = "cook_name")
    private String cookName;

    @Column(name = "cook_price")
    private Integer cookPrice;

    public Cook() {
    }

    public Cook(String cookName, Integer cookPrice) {
        this.cookName = cookName;
        this.cookPrice = cookPrice;
    }

    public Integer getCookCode() {
        return cookCode;
    }

    public String getCookName() {
        return cookName;
    }

    public Integer getCookPrice() {
        return cookPrice;
    }
}