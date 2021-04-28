package com.example.spring5_mvc_rest.repositories;

import com.example.spring5_mvc_rest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long > {
Category findByName(String name);
}
