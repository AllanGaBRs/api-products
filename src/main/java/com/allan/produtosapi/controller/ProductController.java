package com.allan.produtosapi.controller;

import com.allan.produtosapi.model.Product;
import com.allan.produtosapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println(product);

        String id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") String id){
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void  deleteProduct(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void updateProduct(@PathVariable("id") String id,
                              @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }

}
