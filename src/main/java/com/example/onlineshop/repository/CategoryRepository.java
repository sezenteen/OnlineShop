package com.example.onlineshop.repository;

import com.example.onlineshop.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // List<Category> findAll(String name);
}
