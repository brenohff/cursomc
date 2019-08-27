package com.brenohff.cursomc.controllers;

import com.brenohff.cursomc.domain.CategoryDomain;
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
    public ResponseEntity<List<CategoryDomain>> listAll(){
        List<CategoryDomain> categoryList = new ArrayList<>();

        categoryList.add(new CategoryDomain(1, "Informática"));
        categoryList.add(new CategoryDomain(2, "Escritório"));

        return ResponseEntity.ok().body(categoryList);
    }
}
