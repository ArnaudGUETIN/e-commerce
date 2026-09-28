package com.yirmea.mapper;

import com.yirmea.dto.CategoryDTO;
import com.yirmea.entities.Category;
import org.springframework.stereotype.Service;


public class mapCategoryToCategoryDTO {
    public static CategoryDTO mapCategoryToCategoryDTO(Category c){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setLabel(c.getLabel());
        categoryDTO.setId(c.getId());
        return categoryDTO;
    }
}
