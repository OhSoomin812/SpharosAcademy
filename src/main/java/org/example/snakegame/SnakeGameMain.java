package org.example.snakegame;

import org.example.calc.Calc1;
import org.example.knn.Point;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeGameMain {

    public static void main(String[] args) {

        // 준비물
        ArrayList<Tile> tiles = new ArrayList<Tile>();

        for (int i = 0; i <= 100; i++) {
            Tile tile = new Tile(i);
            tiles.add(tile);
        }

        // highway
        tiles.get(3).setDesc(" 12 - 노인에게 길을 비켜주어 노인에게 칭찬받았다.");
        tiles.get(3).setType("고속도로");
        tiles.get(3).setMoving(12);

        tiles.get(7) .setDesc(" 14 - 열심히 역도 훈련을 해서 트로피를 받았다.");
        tiles.get(7).setType("고속도로");
        tiles.get(7).setMoving(14);

        tiles.get(17) .setDesc(" 20 - 나무를 심어서 후에 숲을 만들었다.");
        tiles.get(17).setType("고속도로");
        tiles.get(17).setMoving(20);

        tiles.get(19) .setDesc(" 54 - 경찰에게 범죄자가 있다고 신고한 뒤 표창장을 받았다.");
        tiles.get(19).setType("고속도로");
        tiles.get(19).setMoving(54);

        tiles.get(23) .setDesc(" 12 - 환자를 치료하는 연습을 한 뒤 의사가 되었다.");
        tiles.get(23).setType("고속도로");
        tiles.get(23).setMoving(12);

        tiles.get(31) .setDesc(" 24 - 공부를 열심히 해서 좋은 대학에 진학해 졸업했다.");
        tiles.get(31).setType("고속도로");
        tiles.get(31).setMoving(24);

        tiles.get(33) .setDesc(" 12 - 열심히 일하여 후에 큰돈을 모았다.");
        tiles.get(33).setType("고속도로");
        tiles.get(33).setMoving(12);

        tiles.get(39) .setDesc(" 20 - 닭에게 모이를 줘서 달걀을 많이 얻었다.");
        tiles.get(39).setType("고속도로");
        tiles.get(39).setMoving(20);

        tiles.get(47) .setDesc(" 6 - 청소를 열심히 한 후 남자에게 잘 보였다.");
        tiles.get(47).setType("고속도로");
        tiles.get(47).setMoving(6);

        tiles.get(69) .setDesc(" 18 - 농사를 열심히 지어서 많은 작물을 얻었다.");
        tiles.get(69).setType("고속도로");
        tiles.get(69).setMoving(18);

        tiles.get(75) .setDesc(" 10 - 학을 연구해 후에 화학자가 되었다.");
        tiles.get(75).setType("고속도로");
        tiles.get(75).setMoving(10);

        tiles.get(79) .setDesc(" 20 - 달리기에서 1등을 했다.");
        tiles.get(79).setType("고속도로");
        tiles.get(79).setMoving(20);

        tiles.get(89) .setDesc(" 2 - 공산군을 쫓아내고 전투에서 승리하였다.");
        tiles.get(89).setType("고속도로");
        tiles.get(89).setMoving(2);

        //snake
        tiles.get(21) .setDesc(" 20 - 스케이트를 지정 장소가 아닌 언 호수에서 타다가 얼음이 깨져 빠졌다.");
        tiles.get(21).setType("뱀");
        tiles.get(21).setMoving(20);

        tiles.get(28) .setDesc(" 22 - 공부를 열심히 안 해 훗날 거지가 되었다(...).");
        tiles.get(28).setType("뱀");
        tiles.get(28).setMoving(22);

        tiles.get(29) .setDesc(" 20 - 벽에 낙서를 해서[14] 한 여자한테[15] 스팽킹을 당했다(...).");
        tiles.get(29).setType("뱀");
        tiles.get(29).setMoving(20);

        tiles.get(43) .setDesc(" 18 - 친구를 폭행해서 경찰에게 용서를 빌으며 깽값을 물어주게 되었다.");
        tiles.get(43).setType("뱀");
        tiles.get(43).setMoving(18);

        tiles.get(57) .setDesc(" 16 - 개를 발로 찼다가 개한테 쫓기게 된다(...).");
        tiles.get(57).setType("뱀");
        tiles.get(57).setMoving(16);

        tiles.get(65) .setDesc(" 52 - 여자를 성추행해서 감옥에 갇혔다.");
        tiles.get(65).setType("뱀");
        tiles.get(65).setMoving(52);

        tiles.get(67) .setDesc(" 16 - 과식해서 배탈이 났다. 당시 시대상을 생각하면 불량식품에 관한 내용으로도 해석할 수 있다.");
        tiles.get(67).setType("뱀");
        tiles.get(67).setMoving(16);

        tiles.get(71) .setDesc(" 22 - 불발탄을 가지고 놀다가 폭발해서 다친다.");
        tiles.get(71).setType("뱀");
        tiles.get(71).setMoving(22);

        tiles.get(83) .setDesc(" 22 - 기찻길에서 놀다가 기차에 치일 위기에 처한다.");
        tiles.get(83).setType("뱀");
        tiles.get(83).setMoving(22);

        tiles.get(93) .setDesc(" 30 - 지푸라기에 불을 붙이는 불장난을 하는 바람에 화재가 났다.");
        tiles.get(93).setType("뱀");
        tiles.get(93).setMoving(30);

        tiles.get(95) .setDesc(" 14 - 나무를 너무 많이 베어서 홍수가 나 휩쓸린다.");
        tiles.get(95).setType("뱀");
        tiles.get(95).setMoving(14);

        tiles.get(97) .setDesc(" 20 - 나무에 올라갔다가 추락했다.");
        tiles.get(97).setType("뱀");
        tiles.get(97).setMoving(20);

        //지금 현재 위치를 알아야 한다.
        int current = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            // 로직
            System.out.println("마음의 준비를 하시고 Enter");
            scanner.nextLine();

            // 주사위 굴리기 - value
            int value = Calc1.roll();
            System.out.println("주사위 눈은: " + value);

            // 어떤 타일을 가져와야 하나? current +  value 의 타일을 가져와야 함
            current += value;
            System.out.println("현재 위치: " + current);

            // 만일 current + value 전체 99 보다 크면 break
            if (current > 99) {
                System.out.println("Game over");
                break;
            }

            Tile currentTile = tiles.get(current);

            System.out.println("=======================================");
            System.out.println(currentTile);

            // 타일 정보에 desc 정보가 있다면 다른 곳으로 이동
            if (currentTile.getDesc() != null) {
                // 화면에 desc 출력

                int moving = currentTile.getMoving();
                String type = currentTile.getType();

                // 어떤 방향으로 얼마나 이동해야 하는지 알아야 한다

                // current 위치 바꿔줘야 한다.
                if (type.equals("고속도로")) {
                    current += moving;
                } else {
                    current -= moving;
                }

                Tile desc = tiles.get(current);
                System.out.println(desc);
            }
        }

    }

}
