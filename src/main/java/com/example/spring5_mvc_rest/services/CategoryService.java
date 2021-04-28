package com.example.spring5_mvc_rest.services;

import com.example.spring5_mvc_rest.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
