package org.example.save;

public class PiggyMain {

    public static void main(String[] args) {

        PiggySave my = new PiggySave();
        PiggySave your = new PiggySave();

        my.deposit(1000);
        my.deposit(3000);
        my.deposit(5000);   // 9000

        your.deposit(500);
        your.deposit(1000);

        System.out.println(my.withdraw());
        System.out.println(your.withdraw());

        System.out.println();
    }
}
