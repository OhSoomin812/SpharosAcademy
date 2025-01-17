package org.example;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {10, 30, 24, 32, 42, 15};

        //length = 6
        //인덱스 번호 = 0 ~ 5
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("-----------------------------------------");

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
