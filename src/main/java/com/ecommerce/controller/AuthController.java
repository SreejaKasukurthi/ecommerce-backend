package com.ecommerce.controller;

import com.ecommerce.config.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {

        String username = user.get("username");
        String password = user.get("password");

        if ("admin".equals(username) && "admin".equals(password)) {
            String token = JwtUtil.generateToken(username);
            return Map.of("token", token);
        }

        throw new RuntimeException("Invalid credentials");
    }
}