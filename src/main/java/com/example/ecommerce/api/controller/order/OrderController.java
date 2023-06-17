package com.example.ecommerce.api.controller.order;

import com.example.ecommerce.model.LocalUser;
import com.example.ecommerce.model.Orders;
import com.example.ecommerce.service.OrdersService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrdersService ordersService;

    public OrderController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> getOrders(@AuthenticationPrincipal LocalUser user) {
        return ordersService.getOrders(user);
    }
}
