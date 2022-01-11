package com.bridgelabz.regexregistration;

@FunctionalInterface
public interface ValidateEmail {
public boolean validateEmail(String mail)throws UserValidationException;
}
