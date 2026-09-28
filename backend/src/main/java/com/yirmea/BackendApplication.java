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






    }
}
