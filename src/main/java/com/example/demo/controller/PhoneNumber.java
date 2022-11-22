package com.example.demo.controller;

import com.example.demo.dto.PhoneNumberDto;
import com.example.demo.servise.PhoneNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/phone_numbers")
@RequiredArgsConstructor
public class PhoneNumber {

    private final PhoneNumberService phoneNumberService;

    @PostMapping("/create/{user_id}")
    public Long addPhoneNumber(@Valid @RequestBody PhoneNumberDto phoneNumberDto, @PathVariable(name = "user_id") Long id) {
        return phoneNumberService.addPhoneNumber(phoneNumberDto, id);
    }

}
