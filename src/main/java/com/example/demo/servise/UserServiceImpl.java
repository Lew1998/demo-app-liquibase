package com.example.demo.servise;

import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::userToDto).collect(Collectors.toList());
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userRepository.findAllByName(name);
    }


    @Override
    public Long addUser(UserDto userDto) {
        return userRepository.save(UserMapper.toUser(userDto)).getId();
    }
}
