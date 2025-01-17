package main.org.day2;

public class IfTest {

    public static void main(String[] args) {

        // 랜덤 int 값
        int value = (int)(Math.random() * 6) + 1;

        System.out.println(value);

        int oddEven = value % 2;    // 2로 나눈 나머지 0, 1

        // 만일 oddEven 값이 0이면 짝수 출력 ==> boolean
        if (oddEven == 0) {
            System.out.println("짝수");
        } else {    // 만약 oddEven 값이 1이면 홀수 출력
            System.out.println("홀수");
        }


        // 또 다른 방법 (강사님이 선호함)
        if (oddEven == 0) {
            System.out.println("짝수");
            return;
        }
            System.out.println("홀수");


        // 삼항연산자 조건식(결과) ? 참인 경우 결과 : 거짓인 경우
        String result = oddEven == 1 ? "홀수" : "짝수";

    }
}
