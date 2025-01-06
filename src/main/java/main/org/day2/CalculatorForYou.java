package main.org.day2;

import java.util.Scanner;

public class CalculatorForYou {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산기를 시작합니다.");

        // 계속 유지해야 하는 데이터
        int sum = 0;

        // 몇 번 일지 몰라
        while (true) {
            System.out.print("숫자를 입력하세요('END'를 입력 시 종료됩니다.): ");
            String input = scanner.nextLine();


            if(input.equals("END")) {
                System.out.println("계산기를 종료합니다.");
                System.out.println("합계: " + sum);
                break;
            }

            int num =Integer.parseInt(input);
            sum += num;

            System.out.println("합계: " + sum);

        }
    }
}
