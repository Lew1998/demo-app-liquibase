package com.example.demo.valid;

import com.example.demo.model.PhoneNumber;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public class PhoneNumberValid {
    public static String formatPhoneNumber(String phone) {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneNumberUtil.parse(phone, null);

            if (!phoneNumberUtil.isValidNumber(phoneNumber)) {
                throw new NumberFormatException("Иди нахуй татарин");
            }
            return phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164).substring(1);

        } catch (Exception e) {
            throw new RuntimeException("Правильно вводи бля" + " " + phone);
        }
    }
}
