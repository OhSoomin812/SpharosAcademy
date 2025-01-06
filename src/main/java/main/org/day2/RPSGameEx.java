package main.org.day2;

import java.util.Scanner;

public class RPSGameEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가위0, 바위1, 보자기2 입력하세요: ");
        String str = scanner.nextLine();
        System.out.println(str);

        int user = Integer.parseInt(str);
        // 컴 값 0, 1, 2
        int com = (int)(Math.random() * 3);

        // user 값이 com 보다 작을 경우
        user = user < com ? user + 3 : user;

        int result = user - com;

        switch (result) {
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("짐");
                break;
        }


    }
}
