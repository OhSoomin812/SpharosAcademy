package org.example.testGame;

import java.util.Scanner;

public class TestNodeUI {

    private final Scanner scanner = new Scanner(System.in);


    public void startTest() {
        TestNode currentNode = (TestNodeService.INSTANCE.getFirstQuestion());

        if (currentNode == null) {
            System.out.println("테스트가 초기화되지 않았습니다.");
            return;
        }

        while (currentNode != null) {
            if (currentNode.result != null) {

                // 테스트 결과 유형
                System.out.println("당신은 " + currentNode.result + " 입니다 !");
                break;
            }

            // 질문 출력
            System.out.println(currentNode.question);
            System.out.print("Yes 또는 No를 입력하세요: ");
            String answer = scanner.nextLine().trim();

            try {
                currentNode = TestNodeService.INSTANCE.getNextNode(currentNode, answer);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. Yes 또는 No로 다시 입력해주세요.");
            }
        }
    }

}
