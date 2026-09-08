package com.yirmea.services;

import com.yirmea.dao.CategoryRepository;
import com.yirmea.dao.ItemRepository;
import com.yirmea.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Category addCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Category addCategory(String label) {
        Category category =  new Category();
        category.setLabel(label);
        return this.addCategory(category);
    }

    @Override
    public Category updateCategory(Long id, String label) {
        Category category = this.categoryRepository.getOne(id);
        category.setLabel(label);
        return this.categoryRepository.save(category);
    }

    @Override
    public boolean removeCategory(Long id) {
        this.categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();
    }
}
