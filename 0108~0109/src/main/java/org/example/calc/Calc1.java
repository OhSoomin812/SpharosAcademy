package org.example.calc;

public class Calc1 {

    // f(X) => y에 해당
    public static int plus(int x, int y) {
        int result = x + y;

        return result;
    }

    public static int roll() {
        int result = (int)(Math.random() * 6) + 1;
        return result;
    }


}
