package com.example.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Set;

@Getter
@Setter
@Accessors(chain = true)
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private PassportDto passport;
    private Set<PhoneNumberDto> phoneNumbers;
}
