package org.example.word;

public class WordMain {

    public static void main(String[] args) {
        // 필요한 객체 준비
        // 프로젝트 시작
        WordService wordService = new WordService();
        WordUI wordUI = new WordUI(wordService);

        wordUI.exam();
    }

}


