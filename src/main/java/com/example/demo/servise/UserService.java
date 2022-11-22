package com.example.demo.servise;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> getAllUsers();

    List<User> getUsersByName(String name);

    Long addUser(UserDto userDto);
}
