package com.sx1n.shop.resources;

import com.sx1n.shop.entities.Product;
import com.sx1n.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private ProductService service;
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> ProductList = service.findAll();
        return ResponseEntity.ok().body(ProductList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
