package org.example;

import java.util.Arrays;

public class Lotto1_1 {

    public static void main(String[] args) {

        int[] balls = new int[6];   // 로또 번호 6개 저장
        int count = 0;

        while (count < 6) {
            int temp = (int)(Math.random() * 45) + 1;
            boolean isDuplicate = false;

            // 중복 체크
            for (int i = 0; i < count; i++) {
                if(balls[i] == temp) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                balls[count] = temp;
                count++;
            }
        }

        Arrays.sort(balls);
        System.out.println("🎉 생성된 로또 번호: " + Arrays.toString(balls));
    }
}
