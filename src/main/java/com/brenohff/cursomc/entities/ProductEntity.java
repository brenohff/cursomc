package com.brenohff.cursomc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class ProductEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;

    @ManyToMany
    @JoinTable(name = "PRODUCT_CATEGORY",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<CategoryEntity> categoryList = new ArrayList<>();

    public ProductEntity(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
