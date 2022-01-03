package org.opentutorials.javatutorials.condition;

public class ElseDemo {

    public static void main(String[] args) {

        if (false) {
            System.out.println(1); // if문이 false라서 이 구문은 출력되지않음.
        } else if (true) {
            System.out.println(2); // if문이 true라서 이 구문은 출력됨.
        } else if (true) {
            System.out.println(3); // if 조건문이 쭉 내려오면서 true가 한번이라도 발견이 되면, 그 다음거가 true든 false든 else든 상관없이 종료가 되면서 if 구문이 끝나는곳부터 다시시작됨.
        } else {
            System.out.println(4);
            // 만약, 위의 구문이 전부 false 라는 가정이라면, 마지막에 else 가 실행된다. 필요하지않다면 else 생략 또한 가능.
        }
      // if 구문이 끝나는 부분, 여기서부터 다시 실행

    }

}
