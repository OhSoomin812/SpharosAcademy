package org.example;

import java.util.Arrays;

public class MultiEx {

    public static void main(String[] args) {

        int[][] arr = new int[6][];

        System.out.println(Arrays.toString(arr));

        int[] temp1 = {1, 2, 3};
        arr[0] = temp1;

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0] == temp1);
    }
}
