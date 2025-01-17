package main.org.day2;

import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        //Scanner 필요
        Scanner scanner = new Scanner(System.in);

        // 당첨값 필요- 랜덤값
        int value = (int)(Math.random() * 6);   // 0 부터 5까지
        int user;

        //반복 처리
        for(int i = 0; i < 6; i++) {
            System.out.println("i ------------ " + i);
            scanner.nextLine();

            if (i == value) {
                System.out.println("당첨되셨습니다.");
                break;
            }
        }
    }
}
