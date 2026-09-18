package com.yirmea.web;

import com.yirmea.dto.CategoryDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Item;
import com.yirmea.entities.User;
import com.yirmea.services.CategoryService;
import com.yirmea.services.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService ;

    @GetMapping("/categories")
    public List<CategoryDTO> getAll(){
        return this.categoryService.getAllCategories();
    }

    @GetMapping("/")
    public Category helloMessage(){
        List items = new ArrayList();
        items.add(new Item());
        return new Category(null,"name",items);
    }
    @PostMapping("add")
    public CategoryDTO addCategorie(@RequestBody Category category){
        return this.categoryService.addCategory(category.getLabel());
    }
}
