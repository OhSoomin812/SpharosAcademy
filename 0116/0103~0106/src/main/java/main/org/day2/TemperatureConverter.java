package main.org.day2;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) 섭씨 -> 화씨");
        System.out.println("2) 화씨 -> 섭씨");
        System.out.print("선택지를 고르세요 (1 또는 2): ");
        int choice = Integer.parseInt(scanner.nextLine());

        double cel = 0;
        double fah = 0;

        if (choice == 1) {
            System.out.print("섭씨를 입력하세요: ");
            cel = Double.parseDouble(scanner.nextLine());
            fah = (cel * 9/5) + 32;
            System.out.printf("섭씨 %.2f°C는 화씨 %.2f°F입니다.\n", cel, fah);
        } else if (choice == 2) {
            System.out.print("화씨를 입력하세요: ");
            fah = Double.parseDouble(scanner.nextLine());
            cel = (fah - 32) * 5/9;
            System.out.printf("화씨 %.2f°F는 섭씨 %.2f°C입니다.\n", fah, cel);
        } else {
            System.out.println("올바른 선택지를 입력해주세요. 프로그램을 종료합니다.");
        }
    }
}
