package com.example.demo.controller;

import com.example.demo.dto.PassportDto;
import com.example.demo.servise.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/passports")
@RequiredArgsConstructor
public class PassportController {
    private final PassportService passportService;

    @PostMapping("/create/{user_id}")
    public Long addPassport(@Valid   @RequestBody PassportDto passportDto, @PathVariable(name = "user_id") Long id) {
        return passportService.addPassport(passportDto, id);
    }
}
