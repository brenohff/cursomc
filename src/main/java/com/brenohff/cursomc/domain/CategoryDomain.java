package com.brenohff.cursomc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CategoryDomain implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
}
