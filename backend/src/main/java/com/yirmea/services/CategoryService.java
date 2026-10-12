package com.yirmea.services;

import com.yirmea.dto.CategoryDTO;
import com.yirmea.entities.Category;

import java.util.List;

public interface CategoryService {
    CategoryDTO addCategory(Category category);
    CategoryDTO addCategory(String label);
    CategoryDTO updateCategory(Long id, String label);
    CategoryDTO getCategory(Long id);
    boolean removeCategory(Long id);
    List<CategoryDTO> getAllCategories();
}
