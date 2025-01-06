package main.org.day2;

import java.util.Scanner;

public class RPSGame2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userWins = 0;
        int comWins = 0;

        System.out.println("가위바위보 삼세판을 시작합니다.");

        // 삼세판
        while (userWins <2 && comWins < 2) {
            int comValue = (int)(Math.random() * 3);    //컴퓨터
            String com = "";

            // 컴퓨터의 선택 문자열로 변환
            if (comValue == 0){
                com = "가위";
            }else if(comValue == 1){
                com = "바위";
            }else {
                com = "보";
            }

            // 사용자 입력 받기
            System.out.print("가위, 바위, 보 중 하나를 입력해주세요: ");
            String user = scanner.nextLine();


            // 가위 바위 보 -> 숫자
            int userValue;
            if(user.equals("가위")){
                userValue = 0;
            }else if(user.equals("바위")){
                userValue = 1;
            }else if(user.equals("보")){
                userValue = 2;
            }else {
                System.out.println("올바른 값을 입력해주세요.");
                continue;
            }
            
            // 승부 판정
            userValue = userValue < comValue ? userValue + 3 : userValue;

            switch(userValue - comValue) {
                case 0:
                    System.out.println("Draw (당신: " + user + ", 컴퓨터: " + com + ")");
                    break;
                case 1:
                    System.out.println("Win (당신: " + user + ", 컴퓨터: " + com + ")");
                    userWins++;
                    break;
                case 2:
                    System.out.println("Lose (당신: " + user + ", 컴퓨터: " + com + ")");
                    comWins++;
                    break;
            }

            // 현재 스코어 출력
            System.out.println("현재 스코어 - 사용자: " + userWins + "승, 컴퓨터: " + comWins + "승");
        }

        if(userWins == 2){
            System.out.println("축하합니다! 삼세판에서 당신이 이겼습니다!");
        } else {
            System.out.println("아쉽습니다. 삼세판에서 컴퓨터가 이겼습니다.");
        }

    }
}
