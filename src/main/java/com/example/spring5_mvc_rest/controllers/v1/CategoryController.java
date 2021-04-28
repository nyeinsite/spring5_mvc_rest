package com.example.spring5_mvc_rest.controllers.v1;

import com.example.spring5_mvc_rest.api.v1.model.CategoryDTO;
import com.example.spring5_mvc_rest.api.v1.model.CategoryListDTO;
import com.example.spring5_mvc_rest.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/categories/")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getallCategories(){
     return new CategoryListDTO(categoryService.getAllCategories());

    }
   @GetMapping("{name}")
   @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
