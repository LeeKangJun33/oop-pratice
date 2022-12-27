package org.example;

public class WrongFixedPasswordGenerator implements  PasswordGenerator {


    @Override
    public String generatePassword() {

        return "ss"; //2글자
    }
}
