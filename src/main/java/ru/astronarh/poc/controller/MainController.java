package ru.astronarh.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.astronarh.poc.dao.Product;
import ru.astronarh.poc.model.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private ProductRepository repository;

    @GetMapping({"/", "/index"})
    public String main(Model model) {

        Map<String, String> prices = new HashMap<>();

        for (int i = 10; i < 100; i++) {
            prices.put(String.valueOf(System.currentTimeMillis()), String.valueOf(i));
        }

        repository.save(new Product(1, "product name", prices));

        model.addAttribute("products", repository.findAll());

        return "index";
    }
}
