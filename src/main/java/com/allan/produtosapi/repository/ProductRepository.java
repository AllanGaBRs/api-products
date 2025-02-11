package com.allan.produtosapi.repository;

import com.allan.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);
}
