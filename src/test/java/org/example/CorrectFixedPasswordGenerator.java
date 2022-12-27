package org.example;

public class CorrectFixedPasswordGenerator implements  PasswordGenerator {


    @Override
    public String generatePassword() {
        return "aabcdefg"; //8글자
    }
}
