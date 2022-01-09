package com.bridgelabz.regexjunittest;
@FunctionalInterface
public interface ValidatePassword {
public boolean validatePassword(String password)throws UserValidationException;
}
