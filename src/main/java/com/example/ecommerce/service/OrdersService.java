package com.example.ecommerce.service;

import com.example.ecommerce.model.LocalUser;
import com.example.ecommerce.model.Orders;
import com.example.ecommerce.model.dao.OrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private OrderDAO orderDAO;

    public OrdersService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public List<Orders> getOrders(LocalUser user) {
        return orderDAO.findByUser(user);

    }
}
