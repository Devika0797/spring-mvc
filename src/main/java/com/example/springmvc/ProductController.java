package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;


    public void ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public String getAllProducts (Model model){
        model.addAttribute("frontProducts", productService.getAllProducts());
        return "all_products";
    }


    @PostMapping("/add")
    public String addNewProduct(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/products/all";
    }


}
