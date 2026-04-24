package com.ecommerce.controller;

import com.ecommerce.dto.OrderDTO;
import com.ecommerce.entity.Order;
import com.ecommerce.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    // ✅ Place Order (using DTO)
    @PostMapping
    public Order placeOrder(@RequestBody OrderDTO dto) {
        return service.placeOrder(dto);
    }

    // ✅ Get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }
    
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody OrderDTO dto) {
        return service.updateOrder(id, dto);
    }
    
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
        return "Order deleted successfully";
    }
}