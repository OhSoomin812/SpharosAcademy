package org.example;

public class MinEx {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 4, -3};

        int min = arr[0];

        for(int value : arr) {
            System.out.println(value);

            //value 가 min 보다 작으면 min 값은 value가 되어야함
            if (value < min) {
                min = value;
            }

            // 삼항연산자
            // min = value < min ? value : min;
        }

        System.out.println("Min: " + min);

    }
}
