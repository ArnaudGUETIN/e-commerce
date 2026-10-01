package com.yirmea.services;

import com.yirmea.dao.CategoryRepository;
import com.yirmea.dao.ItemRepository;
import com.yirmea.dto.ItemDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public ItemDTO addItem(Item item) {

        return mapItemToItemDTO(this.itemRepository.save(item));
    }

    @Override
    public ItemDTO addItem(String name, String desc, BigDecimal price, int stock) {
        Item item =  new Item();
        item.setName(name);
        item.setDescription(desc);
        item.setPrice(price);
        item.setStock(stock);
        return this.addItem(item);
    }

    @Override
    public ItemDTO addItem(String label) {
        Item item =  new Item();
        item.setName(label);
        return this.addItem(item);
    }

    @Override
    public ItemDTO updateItem(Long id, String label) {
        Item item = this.itemRepository.getReferenceById(id);
        item.setName(label);
        return mapItemToItemDTO(this.itemRepository.save(item));
    }

    @Override
    public ItemDTO getItem(Long id) {
        Item item = this.itemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Item not found with: " + id));
        return mapItemToItemDTO(item);
    }


    @Override
    public boolean removeItem(Long id) {
        this.itemRepository.deleteById(id);
        return true;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> all = this.itemRepository.findAll();
        List<ItemDTO> itemDTOS = new ArrayList<>();
        for (Item i : all){
            itemDTOS.add(mapItemToItemDTO(i));
        }
        return itemDTOS;
    }

    @Override
    public ItemDTO affectToCategory(Long idItem, Long idCat) {
        Item item = this.itemRepository.findById(idItem).get();
        Category category = this.categoryRepository.findById(idCat).get();
        item.setCategory(category);

        return mapItemToItemDTO(this.itemRepository.save(item));
    }


    public ItemDTO mapItemToItemDTO(Item i){
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(i.getId());
        itemDTO.setName(i.getName());
        if(i.getCategory()!=null){
            itemDTO.setCategoryId(i.getCategory().getId());
        }

        itemDTO.setDescription(i.getDescription());
        itemDTO.setPrice(i.getPrice());
        itemDTO.setStock(i.getStock());
        itemDTO.setImageUrl(i.getImageUrl());
        return itemDTO;
    }


}
