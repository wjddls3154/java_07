package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0]; // args[0] 의 입력값이 id
        String password = args[1]; // args[1] 의 입력값이 password
        if(id.equals("egoing")) {
            if(password.equals("111111")) {
                System.out.println("right"); // 만일, 입력값 id가 egoing으로 일치하고, password가 111111로 일치하면 right을 출력한다.
            } else {
                System.out.println("wrong"); // 그 상황이 아니라면 wrong 을 출력한다.
            }

        } else {
            System.out.println("wrong"); // 위의 if문이 전부 false 라면 wrong을 출력한다.
        }

    }
}
