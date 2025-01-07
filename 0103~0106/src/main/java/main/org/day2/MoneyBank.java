package main.org.day2;

import java.util.Scanner;

public class MoneyBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double money = Double.parseDouble(scanner.nextLine());   // 원금
        double rate = 0.07;    // 금리

        for (int i = 0; i < 10; i++) {
            money = money + (money * rate);
            int intMoney = (int) money;
            System.out.println("      " + intMoney);
        }// end for
    }
}
