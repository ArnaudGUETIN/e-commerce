package com.yirmea;

import com.yirmea.dao.UserRepository;
import com.yirmea.dto.CategoryDTO;
import com.yirmea.dto.ItemDTO;
import com.yirmea.entities.Category;
import com.yirmea.entities.Item;
import com.yirmea.entities.User;
import com.yirmea.services.CategoryService;
import com.yirmea.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);



     //   String boisson = String.valueOf(new Item());
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("g@gmail.com");
        user.setName("Eliel");
        this.userRepository.save(user);

        CategoryDTO ci = categoryService.addCategory("Imprimantes");
        CategoryDTO o =categoryService.addCategory("Ordinateurs");
        CategoryDTO sm = categoryService.addCategory("Smartphones");
        CategoryDTO sv = categoryService.addCategory("Serveurs");

        for(CategoryDTO c : categoryService.getAllCategories()){
            System.out.println("categorie :" +c.getLabel());
            System.out.println("--------------------------------");
        }

        ItemDTO i1 = itemService.addItem("HPLaserJet","Une imprimante stylé", BigDecimal.valueOf(150000),5);
        ItemDTO i2 = itemService.addItem("MacBook Pro","Un pc", BigDecimal.valueOf(500000),15);
        ItemDTO i3 = itemService.addItem("Samsung galaxy s26","un telephone", BigDecimal.valueOf(400000),50);
        ItemDTO i4 = itemService.addItem("Intel lite pro","un serveur", BigDecimal.valueOf(15000000),2);







    }
}
