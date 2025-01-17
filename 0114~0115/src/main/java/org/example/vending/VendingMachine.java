package org.example.vending;

public enum VendingMachine {

    INSTANCE;

    private int iaCount;
    private int teaCount;
    private int milkCount;

    private VendingMachine() {
//        this.iaCount = 10;
//        this.teaCount = 5;
//        this.milkCount = 7;
        this(10, 5, 7); // 생성자 함수에서 또다른 생성자 함수를 호출할 때 사용
    }

    private VendingMachine(int iaCount, int teaCount, int milkCount) {
        this.iaCount = iaCount;
        this.teaCount = teaCount;
        this.milkCount = milkCount;
    }

    public String makeIA() {
        return "Ice Americano " + this.iaCount--;
    }

    public String makeTea() {
        return "Green Tea " + this.teaCount--;
    }

    public String makeMilkCoffee() {
        return "Milk Coffee " + this.milkCount--;
    }
}
