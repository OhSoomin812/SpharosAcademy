package org.example.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoMachine {

    public static List<Integer> generateLottoNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        List<Integer> selectedNumbers = numbers.subList(0, 6);
        Collections.sort(selectedNumbers);

        return selectedNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력해주세요(5000원 당 1장): ");
        int money = 0;
        try {
            money = Integer.parseInt(scanner.nextLine());
            if (money < 5000) {
                System.out.println("금액이 부족합니다. 최소 5000원을 입력해주세요.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            return;
        }

        // 로또 장수 계산
        int count = money / 5000;

        for (int i = 0; i < count; i++) {
            List<Integer> lottoNumbers = generateLottoNumbers();
            System.out.println("=== 로또 " + (i + 1) + "번 ===");
            System.out.println(lottoNumbers);
            System.out.println("-----------------------------------------");
        }

    }

}
