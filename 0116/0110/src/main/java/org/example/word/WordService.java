package org.example.word;

import java.util.ArrayList;

public class WordService {

    private ArrayList<WordVO> wordList;

    public WordService() {
        wordList = new ArrayList<>();
        wordList.add(new WordVO("사과", "apple"));
        wordList.add(new WordVO("바나나", "banana"));
        wordList.add(new WordVO("강아지/개", "dog"));
        wordList.add(new WordVO("수박", "watermelon"));
        wordList.add(new WordVO("책", "book"));
        wordList.add(new WordVO("연필", "pencil"));
        wordList.add(new WordVO("병", "bottle"));
        wordList.add(new WordVO("딸기", "strawberry"));
        wordList.add(new WordVO("컵", "cup"));
        wordList.add(new WordVO("마우스", "mouse"));
    }

    // 다음 단어를 뽑아주는 기능
    public WordVO getNextWord() {
        if(wordList.isEmpty()) return null;

        return wordList.remove(0);
    }
}
