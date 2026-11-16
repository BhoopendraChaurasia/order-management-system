package com.bhoopendracodes.userservice.controller;

import com.bhoopendracodes.userservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users/health")
    public String healthCheck() {
        return "User service is up and running";
    }
}
