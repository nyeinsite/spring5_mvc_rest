package com.example.spring5_mvc_rest.api.v1.mapper;

import com.example.spring5_mvc_rest.api.v1.model.CategoryDTO;
import com.example.spring5_mvc_rest.domain.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper {
    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
}