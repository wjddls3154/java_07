package org.opentutorials.javatutorials.condition;

public class Condition2Demo {
    public static void main(String[] args) {

        if (false) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

        /**
         * if 절이 true 라면 then 절이 모두 실행되서 1 2 3 4 를 출력하고 나와서 있는 또 다른 출력문 5를 출력한다.
         * 허나, if 절이 false 라면, then 절의 출력에 해당하는 1 2 3 4 의 내용을 무시하고 뛰어넘고 다음에 있는 5만 출력한다.
         */
    }

}
