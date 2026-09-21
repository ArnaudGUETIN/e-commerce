package com.yirmea.services;

import com.yirmea.dao.CategoryRepository;
import com.yirmea.dao.ItemRepository;
import com.yirmea.dto.CategoryDTO;
import com.yirmea.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public CategoryDTO addCategory(Category category) {
        return mapCategoryToCategoryDTO(this.categoryRepository.save(category));
    }

    @Override
    public CategoryDTO addCategory(String label) {
        Category category =  new Category();
        category.setLabel(label);
        return this.addCategory(category);
    }

    @Override
    public CategoryDTO updateCategory(Long id, String label) {
        Category category = this.categoryRepository.getReferenceById(id);
        category.setLabel(label);
        return mapCategoryToCategoryDTO(this.categoryRepository.save(category));
    }

    @Override
    public boolean removeCategory(Long id) {
        this.categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> all = this.categoryRepository.findAll();
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        for (Category c : all){
            categoryDTOS.add(mapCategoryToCategoryDTO(c));
        }
        return categoryDTOS;
    }

    public CategoryDTO mapCategoryToCategoryDTO(Category c){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setLabel(c.getLabel());
        return categoryDTO;
    }
}

