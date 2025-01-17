package org.example.vending;

// 지정된 숫자만큼의 객체만 생성 -> 남이 만들 수 없음 -> public 사용 불가
public enum VM2 {
    INSTANCE, 서면, 부산역;

    private int count;

    public String hello() {
        return "Hello " + count++;
    }
}
