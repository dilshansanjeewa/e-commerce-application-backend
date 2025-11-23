package edu.icet.controller;

import edu.icet.model.dto.ProductDto;
import edu.icet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/api/test")
    public String test(){
        return "Test Success";
    }

    @PostMapping("api/add")
    public void add(@RequestBody ProductDto productDto){
        productService.add(productDto);
    }

    @GetMapping("api/get/all")
    public List<ProductDto> getAll(){
        return productService.getAll();
    }
}
