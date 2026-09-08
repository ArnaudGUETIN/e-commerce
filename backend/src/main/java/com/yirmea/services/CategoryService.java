package com.yirmea.services;

import com.yirmea.entities.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category addCategory(String label);
    Category updateCategory(Long id, String label);
    boolean removeCategory(Long id);
    List<Category> getAllCategories();
}
