package com.example.demo.servise;

import com.example.demo.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    Long addPassport(PassportDto passportDto, Long userId);
}
