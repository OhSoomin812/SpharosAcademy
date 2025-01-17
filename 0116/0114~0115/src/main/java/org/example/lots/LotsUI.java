package org.example.lots;

import java.util.Scanner;

public class LotsUI {

    private Scanner scanner;

    public void startGame() {
        this.scanner = new Scanner(System.in);

        while (true) {
            System.out.println("마음의 준비를 하시고 Enter");
            scanner.nextLine();

            String note = LotsBox.INSTANCE.getNext();

            System.out.println(note);

            if(note.equals("당첨")) {
                break;
            }
        }
    }
}
