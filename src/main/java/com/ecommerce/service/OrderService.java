package com.ecommerce.service;

import com.ecommerce.dto.OrderDTO;
import com.ecommerce.entity.Order;
import com.ecommerce.entity.User;
import com.ecommerce.entity.Product;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;   // ✅ IMPORTANT

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    public Order placeOrder(OrderDTO dto) {

        User user = userRepo.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Product product = productRepo.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Order order = new Order();
        order.setUser(user);
        order.setProduct(product);
        order.setQuantity(dto.getQuantity());

        return orderRepo.save(order);
    }
    
    public Order updateOrder(Long id, OrderDTO dto) {

        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        User user = userRepo.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Product product = productRepo.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        order.setUser(user);
        order.setProduct(product);
        order.setQuantity(dto.getQuantity());

        return orderRepo.save(order);
    }
    
    public void deleteOrder(Long id) {

        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        orderRepo.delete(order);
    }

    // ✅ ADD THIS METHOD
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}