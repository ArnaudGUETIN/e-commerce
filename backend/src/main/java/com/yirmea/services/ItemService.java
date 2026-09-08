package com.yirmea.services;

import com.yirmea.entities.Item;

import java.math.BigDecimal;
import java.util.List;

public interface ItemService {
    Item addItem(Item item);
    Item addItem(String name, String desc, BigDecimal price, int stock);
    Item addItem(String name);
    Item updateItem(Long id, String name);
    boolean removeItem(Long id);
    List<Item> getAllItems();
    Item saveItem(Item item);
}
