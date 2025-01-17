package org.example.save;

import java.util.Scanner;

public class SaveUI {

    private SaveService service;
    private Scanner scanner;

    public SaveUI() {
        this.service = new SaveService();
        this.scanner = new Scanner(System.in);
    }

    public void doJob() {

        outer:
        while (true) {
            // 입금 1, 출금 2
            System.out.print("1. 입금, 2. 출금, -1. 종료: ");
            String oper = scanner.nextLine();

            switch (oper) {
                case "1":
                    // 만일 입금이라면
                    // 얼마를 추가할까요?
                    // save.in() 호출
                    System.out.print("얼마를 입금하시겠습니까?: ");
                    int value = Integer.parseInt(scanner.nextLine());

                    int current = this.service.in(value);
                    System.out.println("현재 잔고는 " + current + "원 입니다.");
                    break;

                case "2":
                    // 만일 출금이라면
                    // 얼마를 꺼낼껀가요?
                    // save.out() 호출
                    System.out.print("얼마를 출금하시겠습니까?: ");
                    int value2 = Integer.parseInt(scanner.nextLine());

                    int current2 = this.service.out(value2);
                    System.out.println("현재 잔고는 " + current2 + "원 입니다.");
                    break;

                case "-1":
                    System.out.println("프로그램을 종료합니다.");
                    break outer;
            }

        }
    }
}
