package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto3 {

    public static void main(String[] args) {

        ArrayList<Integer> list =
                IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toCollection(ArrayList::new));

        Collections.shuffle(list);

        System.out.println(list.subList(0, 6));
    }
}
