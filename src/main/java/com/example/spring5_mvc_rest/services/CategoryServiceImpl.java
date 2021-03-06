package com.example.spring5_mvc_rest.services;

import com.example.spring5_mvc_rest.api.v1.mapper.CategoryMapper;
import com.example.spring5_mvc_rest.api.v1.model.CategoryDTO;
import com.example.spring5_mvc_rest.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{
   private final CategoryMapper categoryMapper;
   private final CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }
}
