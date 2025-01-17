package org.example.testGame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TestNode {

    String question;
    TestNode yes;
    TestNode no;
    String result;

    // 생성자 (질문 노드)
    public TestNode(String question){
        this.question = question;
        this.result = null;
    }

    // 생성자 (결과 노드)
    public TestNode(String question, String result){
        this.question = question;
        this.result = result;
    }
}
