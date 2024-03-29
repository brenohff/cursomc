package com.brenohff.cursomc.services;

import com.brenohff.cursomc.entities.CategoryEntity;
import com.brenohff.cursomc.exception.ObjectNotFoundException;
import com.brenohff.cursomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryEntity> listAll() {
        return categoryRepository.findAll();
    }

    public CategoryEntity getCategoryById(Integer categoryId) {
        Optional<CategoryEntity> category = categoryRepository.findById(categoryId);
        return category.orElseThrow(() -> new ObjectNotFoundException(String.format("Object %s not found with id %d", CategoryService.class.getTypeName(), categoryId)));
    }

}