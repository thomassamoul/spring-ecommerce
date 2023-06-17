package com.example.ecommerce.model.dao;

import com.example.ecommerce.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Integer> {
}
