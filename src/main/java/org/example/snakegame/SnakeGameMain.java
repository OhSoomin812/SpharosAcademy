package org.example.snakegame;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeGameMain {

    public static void main(String[] args) {

        // 준비물
        ArrayList<Tile> tiles = new ArrayList<Tile>();

        for (int i = 0; i <= 100; i++) {
            Tile tile = new Tile(i);
            tiles.add(tile);
        }

        System.out.println(tiles);

        // 지금 현재 위치를 알아야 한다.
        int current = 0;
        Scanner scanner = new Scanner(System.in);

        // 로직
        System.out.println("마음의 준비를 하시고 Enter");
    }


}
