package org.example.testGame;

import java.util.LinkedList;

public enum TestNodeService {

    INSTANCE;

    private TestNode root;
    private LinkedList<TestNode> tests;
    
    private TestNodeService() {
        initTestNodes();
    }

    public void initTestNodes() {
        tests = new LinkedList<>();

        // 결과 노드 생성
        TestNode aType = new TestNode(null, "A 유형: 감각적인 인테리어가 돋보이는 포토제닉 공간");
        TestNode bType = new TestNode(null, "B 유형: 다양한 오락시설이 구비된 놀기좋은 공간");
        TestNode cType = new TestNode(null, "C 유형: 영상 시청에 최적화된 빔프로젝트가 구비된 공간");
        TestNode dType = new TestNode(null, "D 유형: 합리적인 가격에 이용이 가능한 가성비 좋은 실속형 모임공간");

        // 질문 노드 생성
        TestNode q1 = new TestNode("카페나 새로운 공간에 가면 인테리어를 유심히 보는 편이다.");
        TestNode q2 = new TestNode("친구들과 엠티 간것같은 분위기를 즐기고 싶다.");
        TestNode q3 = new TestNode("영화, 드라마 등 영상콘텐츠 보는 것을 좋아한다.");
        TestNode q4 = new TestNode("모임을 위해 공간을 빌리는 비용이 조금 부담이 된다");
        TestNode q5 = new TestNode("SNS에 예쁜 공간에서 찍은 사진 올리기를 좋아하고 즐긴다");
        TestNode q6 = new TestNode("보드게임, 오락기, 노래방 시설, 재미있는 게임 등을 하며 시간을 보내는 것이 좋다");
        TestNode q7 = new TestNode("친구들과 영화나 드라마 정주행하는 것을 즐기거나 해보고 싶다");
        TestNode q8 = new TestNode("친구들과 무엇을 하기보다는 맛있는 음식 먹고 이야기 하는게 좋다");
        TestNode q9 = new TestNode("파티룸 대관시 일단 멋지고 예쁜 인테리어는 기본이다");
        TestNode q10 = new TestNode("파티룸 대관시 무리가 모두 즐길 수 있는 게임이나 시설이 구비되어 있는 것이 중요하다");
        TestNode q11 = new TestNode("파티룸 대관시 다른 오락시설보다 빔프로젝터 구비 여부가 중요하다");
        TestNode q12 = new TestNode("파티룸 대관시 예산에 맞는 가격대의 공간을 찾는 것이 제일 중요하다");

        // yes, no Node 맞추기
        q1.yes = q5;
        q1.no = q2;

        q2.yes = q6;
        q2.no = q3;

        q3.yes = q7;
        q3.no = q4;

        q4.yes = q8;
        q4.no = q6;

        q5.yes = q9;
        q5.no = q2;

        q6.yes = q10;
        q6.no = q7;

        q7.yes = q11;
        q7.no = q8;

        q8.yes = q12;
        q8.no = q10;

        q9.yes = aType;
        q9.no = q6;

        q10.yes = bType;
        q10.no = q11;

        q11.yes = cType;
        q11.no = dType;

        q12.yes = dType;
        q12.no = q11;

        root = q1;
    }

    public TestNode getFirstQuestion() {
        return root;
    }

    public TestNode getNextNode(TestNode currentNode, String answer) {
        if (answer.equals("yes")) {
            return currentNode.yes;
        } else if (answer.equals("no")) {
            return currentNode.no;
        }
        throw new IllegalArgumentException("Invalid answer: " + answer);
    }
}
