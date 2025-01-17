package org.example;

public class maxEx {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 4, -3};

        int max = arr[0];

        for(int value : arr) {
            System.out.println(value);

            //value 가 min 보다 작으면 min 값은 value가 되어야함
            if (value > max) {
                max = value;
            }

            // max = value > max ? value : max;
        }

        System.out.println("Max: " + max);
    }
}
