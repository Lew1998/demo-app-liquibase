package com.example.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@Accessors(chain = true)
public class PassportDto {

    private Long id;

    @NonNull
    @Pattern(regexp = "^([0-9]{4})?$")
    private String series;

    @NonNull
    @Pattern(regexp = "^([0-9]{6})?$")
    private String number;
}
