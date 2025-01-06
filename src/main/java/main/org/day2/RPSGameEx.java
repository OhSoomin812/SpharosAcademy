package main.org.day2;

public class RPSGameEx {

    public static void main(String[] args) {
        // 사용자 값
        int user = 2;
        // 컴 값
        int com = 0;

        // user 값이 com 보다 작을 경우
        user = user < com ? user + 3 : user;

        int result = user - com;

        switch (result) {
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("짐");
                break;
        }


    }
}
