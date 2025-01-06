package main.org.example;

public class SwitchEx {

    public static void main(String[] args) {

        int value = (int)(Math.random() * 4);    //0, 1, 2, 3

        switch (value) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
    }
}
