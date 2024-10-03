package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mobile")
public class Mobile {
    @Id
    @Column(name = "srNo", nullable = false)
    private Long srNo;

    @Column(name = "brand", nullable = false, unique = true)
    private String brand;

    @Column(name = "cost",nullable = false)
    private Integer cost;

    @Column(name = "color", nullable = false)
    private String color;

}