package com.brenohff.cursomc.controllers;

import com.brenohff.cursomc.entities.CategoryEntity;
import com.brenohff.cursomc.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<CategoryEntity>> listAll() {
        return ResponseEntity.ok().body(categoryService.listAll());
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<CategoryEntity> getCategoryById(@PathVariable("categoryId") Integer categoryId) {
        return ResponseEntity.ok().body(categoryService.getCategoryById(categoryId));
    }
}
