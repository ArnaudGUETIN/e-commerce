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
@RequestMapping("api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService ;

    @GetMapping("")
    public List<CategoryDTO> getAll(){
        return this.categoryService.getAllCategories();
    }


    @PostMapping("add")
    public CategoryDTO addCategorie(@RequestBody Category category){
        return this.categoryService.addCategory(category.getLabel());
    }

    @PutMapping("update")
    public CategoryDTO updateCategorie(@RequestBody CategoryDTO categoryDTO){
        return this.categoryService.updateCategory(categoryDTO.getId(),categoryDTO.getLabel());
    }

    @DeleteMapping("delete/{id}/{id2}")
    public boolean deleteCategorie(@RequestParam("idCat") Long idCat){
        return this.categoryService.removeCategory(idCat);
    }
}
