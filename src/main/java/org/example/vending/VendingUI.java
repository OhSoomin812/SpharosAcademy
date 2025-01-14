package org.example.vending;

import java.util.Scanner;

public class VendingUI {
    // 메서드들간 공유할만한
    private Scanner scanner;

//    //협력자 / 조력자
//    private VendingMachine vendingMachine;

    public VendingUI(){
        this.scanner = new Scanner(System.in);
    }

    public void use(){

        System.out.println("1. 아이스 아메리카노 2. 티 3. 밀크커피 4. 종료");
        System.out.print("입력해주세요: ");
        String oper = this.scanner.nextLine();
        
        switch (oper) {
            case "1":
                System.out.println(VendingMachine.INSTANCE.makeIA());
                break;
            case "2":
                System.out.println(VendingMachine.INSTANCE. makeTea());
                break;
            case "3":
                System.out.println(VendingMachine.INSTANCE.makeMilkCoffee());
                break;
            case "4":
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("1~4 사이의 숫자를 입력하세요.");
                return;
        }

    }
}
