package main.org.example;

import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
        String user = scanner.nextLine();
        int userValue;

        String com;
        int comValue = (int)(Math.random() * 3);

        // 가위 바위 보 userValue 설정
        if(user.equals("가위")){
            userValue = 0;
        }else if(user.equals("바위")){
            userValue = 1;
        }else if(user.equals("보")){
            userValue = 2;
        }else {
            System.out.println("올바른 값을 입력해주세요.");
            return;
        }

        if (comValue == 0){
            com = "가위";
        }else if(comValue == 1){
            com = "바위";
        }else {
            com = "보";
        }

        System.out.println("유저: " + user);
        System.out.println("컴퓨터: " + com);

        userValue = userValue < comValue ? userValue + 3 : comValue;

        switch(userValue - comValue) {
            case 0:
                System.out.println("비겼습니다.");
                break;
            case 1:
                System.out.println("당신이 졌습니다.");
                break;
            case 2:
                System.out.println("당신이 이겼습니다.");
                break;
        }

    }
}
