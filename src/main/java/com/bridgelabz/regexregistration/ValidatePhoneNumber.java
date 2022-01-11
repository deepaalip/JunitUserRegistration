package com.bridgelabz.regexregistration;

@FunctionalInterface
public interface ValidatePhoneNumber {
public boolean validatePhoneNumber(String number)throws  UserValidationException;
}
