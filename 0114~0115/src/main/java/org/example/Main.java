package org.example;

import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.kiosk.KiostUI;
import org.example.lots.LotsUI;
import org.example.testGame.TestNode;
import org.example.testGame.TestNodeUI;
import org.example.vending.Scores;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        TestNodeUI ui = new TestNodeUI();
        ui.startTest();


//        KiostUI ui = new KiostUI();
//        ui.startOrder();

//        Scores scores = Scores.builder()
//                .kor(55)
//                .eng(44)
//                .build();

//        Card userCard = CardDeck.INSTANCE.getOne();
//        Card comCard = CardDeck.INSTANCE.getOne();
//
//        System.out.println(userCard);
//        System.out.println(comCard);

//        LotsUI lotsUI = new LotsUI();
//        lotsUI.startGame();

//        VendingMachine vm = new VendingMachine(20, 5, 5);
//        VendingUI ui = new VendingUI(vm);
//
//        ui.use();
    }
}