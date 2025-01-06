package main.org.day2;

public class NestedLoop {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);

            inner:
            for (int j = 0; j < 10; j++) {
                System.out.println("[i: " + i + "] / j: " + j);

                if (j == 5) {
                    break outer;
                }

            }
        }
    }
}
