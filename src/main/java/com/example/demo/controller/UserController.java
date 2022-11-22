package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.servise.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> allUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getByName/{name}")
    public List<User> getUser(@PathVariable(name = "name") String name) {
        return userService.getUsersByName(name);
    }

    @PostMapping("/create")
    public Long addUser(@RequestBody UserDto user) {
       return userService.addUser(user);
    }
}
