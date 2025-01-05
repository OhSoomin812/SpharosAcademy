package main.org.example;

import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] items = new Item[5];

        int total;
        for(total = 0; total < items.length; ++total) {
            items[total] = new Item();
        }

        for(total = 0; total < items.length; ++total) {
            System.out.print("타입을 입력해주세요: ");
            items[total].type = scanner.nextLine();
            System.out.print("금액을 입력해주세요: ");
            items[total].amount = scanner.nextInt();
            scanner.nextLine();
        }

        total = 0;

        for(int i = 0; i < items.length; ++i) {
            total += items[i].amount;
        }

        System.out.println("최종 금액: " + total);
    }
}
