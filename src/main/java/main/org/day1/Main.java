package main.org.day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("배열의 값을 입력하세요: ");

        int total;
        for(total = 0; total < arr.length; ++total) {
            System.out.print("arr[" + total + "] = ");
            arr[total] = scanner.nextInt();
        }

        total = 0;
        int[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int value = var4[var6];
            total += value;
        }

        System.out.println("배열의 총 합 : " + total);
    }
}
