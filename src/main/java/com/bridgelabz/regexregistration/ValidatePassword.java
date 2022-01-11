package com.bridgelabz.regexregistration;

@FunctionalInterface
public interface ValidatePassword {
public boolean validatePassword(String password)throws UserValidationException;
}
