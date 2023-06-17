package com.example.ecommerce.model.dao;

import com.example.ecommerce.model.LocalUser;
import com.example.ecommerce.model.Orders;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface OrderDAO extends ListCrudRepository<Orders, Integer> {
    List<Orders> findByUser(LocalUser user);


}
