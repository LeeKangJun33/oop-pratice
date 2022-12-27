package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        //as -is 방식 내부에서 생성하는 결합은 강한결합이기에 해당부분에대해서 용량을 많이가져감
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to -be 방식(이 방식을 좀더 선호함) implemnts interface로 인해 결합을 낮출수있음
       String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
