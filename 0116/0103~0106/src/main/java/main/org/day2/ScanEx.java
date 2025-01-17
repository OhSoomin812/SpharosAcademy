package main.org.day2;

import java.util.Scanner;

public class ScanEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String str = scanner.nextLine();    // 키보드에서 입력한 문자열
        System.out.println(str);

        int age = Integer.parseInt(str);   // 문자열 -> int

        if (age > 18) {
            System.out.println("성인입니다.");
        }else {
            System.out.println("미성년자 입니다.");
        }
    }
}
