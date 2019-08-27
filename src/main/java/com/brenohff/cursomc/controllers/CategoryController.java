package com.brenohff.cursomc.controllers;

import com.brenohff.cursomc.entity.CategoryEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping()
    public ResponseEntity<List<CategoryEntity>> listAll(){
        List<CategoryEntity> categoryList = new ArrayList<>();

        categoryList.add(new CategoryEntity(1, "Informática"));
        categoryList.add(new CategoryEntity(2, "Escritório"));

        return ResponseEntity.ok().body(categoryList);
    }
}
