package com.yirmea.mapper;

import com.yirmea.dao.CategoryRepository;
import com.yirmea.dto.ItemDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemMapper {
    @Autowired
    private CategoryRepository categoryRepository;
    public Item mapItemDTOToItem(ItemDTO i){
        Category category = null;
        if(i.getCategoryId()!=null && this.categoryRepository.findById(i.getCategoryId()).isPresent()){
            category =this.categoryRepository.findById(i.getCategoryId()).get();
        }
        return Item.builder()
                .name(i.getName())
                .description(i.getDescription())
                .price(i.getPrice())
                .stock(i.getStock())
                .imageUrl(i.getImageUrl())
                .category(category)
                .build();
    }
}
