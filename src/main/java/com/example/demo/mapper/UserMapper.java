package com.example.demo.mapper;

import com.example.demo.dto.PassportDto;
import com.example.demo.dto.PhoneNumberDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.Passport;
import com.example.demo.model.PhoneNumber;
import com.example.demo.model.User;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class UserMapper {
    public static UserDto userToDto(User user) {
        if (isNull(user)) {
            return null;
        }
        return new UserDto()
                .setId(user.getId())
                .setName(user.getName())
                .setSurname(user.getSurname())
                .setAge(user.getAge())
                .setPassport(passportToDto(user.getPassport()))
                .setPhoneNumbers(phoneNumberDtoSet(user.getPhoneNumberSet()));
    }

    public static PassportDto passportToDto(Passport passport) {
        if (isNull(passport)) {
            return null;
        }
        return new PassportDto()
                .setId(passport.getId())
                .setSeries(passport.getSeries())
                .setNumber(passport.getNumber());
    }

    public static Set<PhoneNumberDto> phoneNumberDtoSet(Set<PhoneNumber> set) {
        if (isNull(set)) {
            return Collections.emptySet();
        }
        return set.stream().map(UserMapper::phoneNumberDto).collect(Collectors.toSet());
    }

    public static PhoneNumberDto phoneNumberDto(PhoneNumber phoneNumber) {
        if (isNull(phoneNumber)) {
            return null;
        }
        return new PhoneNumberDto()
                .setId(phoneNumber.getId())
                .setNumber(phoneNumber.getNumber())
                .setRelevance(phoneNumber.isRelevance())
                .setOperator(phoneNumber.getOperator());
    }

    public static User toUser(UserDto userDto) {
        if (isNull(userDto)) {
            return null;
        }
        return new User()
                .setId(userDto.getId())
                .setName(userDto.getName())
                .setSurname(userDto.getSurname())
                .setAge(userDto.getAge());

    }

    public static Passport dtoToPassport(PassportDto passportDto) {
        if (isNull(passportDto)) {
            return null;
        }
        return new Passport()
                .setId(passportDto.getId())
                .setSeries(passportDto.getSeries())
                .setNumber(passportDto.getNumber());
    }

    public static Set<PhoneNumber> phoneNumberSet(Set<PhoneNumberDto> setDto) {
        if (isNull(setDto)) {
            return Collections.emptySet();
        }
        return setDto.stream().map(UserMapper::dtoToPhoneNumber).collect(Collectors.toSet());
    }

    public static PhoneNumber dtoToPhoneNumber(PhoneNumberDto phoneNumberDto) {
        if (isNull(phoneNumberDto)) {
            return null;
        }
        return new PhoneNumber()
                .setId(phoneNumberDto.getId())
                .setNumber(phoneNumberDto.getNumber())
                .setRelevance(phoneNumberDto.isRelevance())
                .setOperator(phoneNumberDto.getOperator());
    }
}
