package org.example.lotto;

import java.util.ArrayList;
import java.util.Collections;

public class LottoMain {

    public static void main(String[] args) {

        ArrayList<LottoBall> balls = new ArrayList<>();

        // 위 두줄과 아래 한줄 코드는 같은 코드
//        LottoBall b1 = new LottoBall(1);
//        balls.add(b1);
//
//        balls.add(new LottoBall(1));

        for (int i = 1; i <= 45; i++) {
            balls.add(new LottoBall(i));
        }

        for (int i = 1; i < 3; i++) {
            Collections.shuffle(balls);
            System.out.println(balls.subList(0, 6));
        }

        System.out.println("================================");
        System.out.println(balls.size());
    }
}
