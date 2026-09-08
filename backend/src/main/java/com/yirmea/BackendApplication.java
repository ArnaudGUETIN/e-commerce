package com.yirmea;

import com.yirmea.dao.UserRepository;
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

        Category ci = categoryService.addCategory("Imprimantes");
        Category o =categoryService.addCategory("Ordinateurs");
        Category sm = categoryService.addCategory("Smartphones");
        Category sv = categoryService.addCategory("Serveurs");

        for(Category c : categoryService.getAllCategories()){
            System.out.println("categorie :" +c.getLabel());
            System.out.println("--------------------------------");
        }

        Item i1 = itemService.addItem("HPLaserJet","Une imprimante stylé", BigDecimal.valueOf(150000),5);
        Item i2 = itemService.addItem("MacBook Pro","Un pc", BigDecimal.valueOf(500000),15);
        Item i3 = itemService.addItem("Samsung galaxy s26","un telephone", BigDecimal.valueOf(400000),50);
        Item i4 = itemService.addItem("Intel lite pro","un serveur", BigDecimal.valueOf(15000000),2);

        i1.setCategory(ci);
        itemService.saveItem(i1);

        i2.setCategory(o);
        itemService.saveItem(i2);


        i3.setCategory(sm);
        itemService.saveItem(i3);

        i4.setCategory(sv);
        itemService.saveItem(i4);





    }
}
