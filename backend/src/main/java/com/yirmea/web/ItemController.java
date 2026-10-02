package com.yirmea.web;

import com.yirmea.dto.ItemDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Item;
import com.yirmea.mapper.ItemMapper;
import com.yirmea.services.CategoryService;
import com.yirmea.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/items")
public class ItemController {

    @Autowired
    private ItemService itemService ;
    @Autowired
    private ItemMapper itemMapper ;

    @GetMapping("/")
    public List<ItemDTO> getAll(){
        return this.itemService.getAllItems();
    }

    @PostMapping("add")
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO){
        return this.itemService.addItem(itemMapper.mapItemDTOToItem(itemDTO));
    }

    @PutMapping("affectToCategory")
    public ItemDTO affect(@RequestParam("idItem") Long idItem, @RequestParam("idCat") Long idCat){
        return this.itemService.affectToCategory(idItem,idCat);
    }




}
