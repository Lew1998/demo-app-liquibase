package com.example.demo.servise;

import com.example.demo.dto.PassportDto;
import com.example.demo.dto.PhoneNumberDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repo.PhoneNumberRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Override
    public Long addPhoneNumber(PhoneNumberDto phoneNumberDto, Long userId) {
        var user = userRepository.findById(userId).orElseThrow();
        var phone = UserMapper.dtoToPhoneNumber(phoneNumberDto).setUser(user);
        return phoneNumberRepository.save(phone).getId();
    }
}
