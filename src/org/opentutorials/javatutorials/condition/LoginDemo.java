package org.opentutorials.javatutorials.condition;

public class LoginDemo {
    public static void main(String[] args) {
        String id = args[0]; // arg에 입력값이 들어온다.
        if(id.equals("egoing")) {
            System.out.println("right");  // 만약에, id에 들어온 입력값이, egoing 이라는 문자라면 right을 출력한다.
        } else {
       System.out.println("wrong"); // 그게 아닌 다른 문자라면 wrong을 출력한다.

        }

    }
}
