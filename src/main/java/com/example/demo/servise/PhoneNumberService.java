package com.example.demo.servise;

import com.example.demo.dto.PhoneNumberDto;
import org.springframework.stereotype.Service;

@Service
public interface PhoneNumberService {
    Long addPhoneNumber(PhoneNumberDto phoneNumberDto, Long userId);
}
