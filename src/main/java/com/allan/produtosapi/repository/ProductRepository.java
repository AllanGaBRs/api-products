package com.allan.produtosapi.repository;

import com.allan.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface ProductRepository extends JpaRepository<Product, String> {

}
