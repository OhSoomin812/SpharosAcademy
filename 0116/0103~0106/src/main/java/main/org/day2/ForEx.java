package main.org.day2;

public class ForEx {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println(i);

            if(i == 5) {
                continue;
            }
        }

        //  System.out.println(i); 에러 발생 : i는 for문 안에서만 사용할 수 있음

        // 초기문은 문장이기에 sout이 들어와도 상관없음
        int i = 0;
        for(System.out.println("i: " + i); i < 10; i++) {
            System.out.println(i);
        }
    }
}
