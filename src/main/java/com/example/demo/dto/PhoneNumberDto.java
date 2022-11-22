package com.example.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class PhoneNumberDto {

    private Long id;

    @NonNull
    private String number;
    private boolean relevance;
    private String operator;
}
