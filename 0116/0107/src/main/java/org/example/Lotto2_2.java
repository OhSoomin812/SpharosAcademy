package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하세요(5000원 당 로또 1장): ");
        int money = Integer.parseInt(scanner.nextLine());
        int time = money / 5000;

        for (int i = 0; i < time; i++) {
            int[] balls = new int[6];   // 로또 당첨 번호
            int count = 0;

            while (count < 6) {
                int temp = (int)(Math.random() * 45) + 1;
                boolean isDuplicate = false;

                // 중복 체크
                for (int j = 0; j < count; j++) {
                    if(balls[j] == temp) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    balls[count] = temp;
                    count++;
                }
            }

            Arrays.sort(balls);
            System.out.println("[" + (i + 1) + "번째] 🎉 생성된 로또 번호: " + Arrays.toString(balls));
        }
    }
}
