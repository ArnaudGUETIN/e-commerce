package com.yirmea.services;

import com.yirmea.dto.ItemDTO;
import com.yirmea.entities.Item;

import java.math.BigDecimal;
import java.util.List;

public interface ItemService {
    ItemDTO addItem(Item item);
    ItemDTO addItem(String name, String desc, BigDecimal price, int stock);
    ItemDTO addItem(String name);
    ItemDTO updateItem(Long id, String name);
    ItemDTO getItemDetails(Long id);
    boolean removeItem(Long id);
    List<ItemDTO> getAllItems();
}
