package org.example.word;

// 로직 위주의 객체 - 인스턴스 변수
// 여러 메서드에서 사용
// 메서드의 결과를 계속 보관하는 경우
// 협력자(조력자) 인스턴스 변수
// 한 번 만들어서 여러 번 사용하는 객체

import java.util.Scanner;

public class WordUI {

    private final WordService service;
    
    // 의존성 주입
    public WordUI(WordService serviceObj) {
        this.service = serviceObj;
    }

    public void exam() {
        Scanner scanner = new Scanner(System.in);

        // 단어 리스트가 빌 때까지 반복
        while (true) {
            WordVO word = this.service.getNextWord();

            // 단어 리스트가 비었다면 종료
            if (word == null) {
                System.out.println("더 이상 단어가 없습니다. 프로그램을 종료합니다.");
                break;
            }

            System.out.println(word.getKor());

            System.out.print("알맞은 영어 단어를 입력해주세요: ");
            String answer = scanner.nextLine();

            System.out.println();

            if(answer.equals(word.getEng())) {
                System.out.println("정답입니다 !");
            } else {
                System.out.println("오답입니다... ");
            }

            System.out.println();
        }

        scanner.close();


    }
}
