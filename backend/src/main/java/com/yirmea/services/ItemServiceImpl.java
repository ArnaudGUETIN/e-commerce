package com.yirmea.services;

import com.yirmea.dao.ItemRepository;
import com.yirmea.entities.Item;
import com.yirmea.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;


    @Override
    public Item addItem(Item item) {

        return this.itemRepository.save(item);
    }

    @Override
    public Item addItem(String name, String desc, BigDecimal price, int stock) {
        Item item =  new Item();
        item.setName(name);
        item.setDescription(desc);
        item.setPrice(price);
        item.setStock(stock);
        return this.addItem(item);
    }

    @Override
    public Item addItem(String label) {
        Item item =  new Item();
        item.setName(label);
        return this.addItem(item);
    }

    @Override
    public Item updateItem(Long id, String label) {
        Item item = this.itemRepository.getReferenceById(id);
        item.setName(label);
        return this.itemRepository.save(item);
    }

    @Override
    public boolean removeItem(Long id) {
        this.itemRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Item> getAllItems() {
        return this.itemRepository.findAll();
    }

    @Override
    public Item saveItem(Item item) {
        return this.itemRepository.save(item);
    }
}
