package org.example.save;

public class SaveService {

    // 잔액
    private int balance;

    public int in(int amount) {
        int result = 0;

        this.balance += amount;
        result += this.balance;

        return result;
    }

    public int out(int amount) {
        int result = 0;

        this.balance -= amount;
        result += this.balance;

        return result;
    }
}
