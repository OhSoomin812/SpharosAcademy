package org.example;

public class SubjectTest {

    public static void main(String[] args) {

        SubjectScore s1 = new SubjectScore();
        System.out.println(s1); // org.example.SubjectScore@5ca881b5 @뒤의 숫자는 JVM 메모리 주소
        s1.subject = "국어";
        s1.score = 30;

        SubjectScore s2 = new SubjectScore();
        s2.subject = "영어";
        s2.score = 40;

        SubjectScore s3 = new SubjectScore();
        s2.subject = "수학";
        s2.score = 50;


        SubjectScore[] arr = {s1, s2, s3};

    }
}
