package main.org.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 오직 br.readLine()만 사용
        String str = br.readLine();

        // 소수 처리
        double value1 = Double.parseDouble(str);

        // 정수 처리
        int value2 = Integer.parseInt(str);

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);

        br.close(); // BufferedReader close()
    }
}
