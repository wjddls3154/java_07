package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("switch(1)");
        switch (1) { // 괄호의 값이 1이라 1에 해당하는 case 1 부터 차례대로 아래값을 출력함.
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(2)");
        switch (2) { // 괄호의 값이 2라 2에 해당하는 case 2 부터 차례대로 아래값을 출력함.
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(3)");
        switch (3) { // 괄호의 값이 3이라 3에 해당하는 case 3 부터 차례대로 아래값을 출력함.
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("Switch 예외");
        switch (1) { // 괄호의 값이 3이라 3에 해당하는 case 3 부터 차례대로 아래값을 출력함.
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }
        /**
         * case문이 끝날때 break를 붙이면 해당되는 경우만 출력하고 break를 해서 switch문이 끝나게된다. 즉, 1로 case 1이 해당이되도, case2,3은 출력되지않는다.
         * 그리고 이것을 조건문으로 만들게된다면, 아래의 코드가 된다.
         */

        // if문 예시
        int val = 1;
        if(val == 1) {
            System.out.println("one");
        } else if(val == 2) {
            System.out.println("two");
        } else if(val == 3) {
            System.out.println("three");
        }
        // if문 종료

        System.out.println("Switch(4)");
        switch (4) { // 괄호의 값이 4
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");

        }
        /**
         * 그리고, 위의 경우처럼 어느것에도 해당되지 않는 4라는 값을 넣었을때, 어디에도 해당 되지가 않기때문에,
         * default 라는 값이 출력된다.
         * switch 문 주의점 : byte,short,char,int,enum,String,Character,Byte,Short,Integer 데이터 타입만 사용가능.
         */


    }

}
