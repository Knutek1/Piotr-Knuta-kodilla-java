package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

@Id
@NotNull
@GeneratedValue
@Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

   private void setId(int id) {
        this.id = id;
    }
@Column(name = "NAME")
@NotNull
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
