package com.example.demo.servise;

import com.example.demo.dto.PassportDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repo.PassportRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PassportRepository passportRepository;


    @Override
    public Long addPassport(PassportDto passportDto, Long userId) {
        var user = userRepository.findById(userId).orElseThrow();
        var passport = UserMapper.dtoToPassport(passportDto).setUser(user);
        return passportRepository.save(passport).getId();
    }
}
