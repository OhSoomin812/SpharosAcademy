package org.example.knn;

import java.util.*;

public class KnnMain {

    public static String knn(List<Point> data, Point newPoint, int k){
        // 거리 계산 및 정렬
        List<PointDistance> distances= new ArrayList<>();

        for (Point p : data) {
            double distance = Math.sqrt(
                    Math.pow(p.xpos - newPoint.xpos, 2) +
                            Math.pow(p.ypos - newPoint.ypos, 2)
            );
            distances.add(new PointDistance(p, distance));
        }

        distances.sort(Comparator.comparingDouble(pd -> pd.distance));

        // 가까운 K 개의 이웃 선택
        Map<String, Integer> typeCounts = new HashMap<>();

        for (int i = 0; i < k; i++) {
            Point neighbor = distances.get(i).point;
            typeCounts.put(neighbor.type, typeCounts.getOrDefault(neighbor.type, 0) + 1);
        }

        // 다수결로 타입 선택
        return typeCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        List<Point> data = new ArrayList<>();
        
        data.add(new Point("짜장면", 1.0, 3.0));
        data.add(new Point("짜장면", 2.0, 3.5));
        data.add(new Point("짬뽕", 3.0, 2.0));
        data.add(new Point("짬뽕", 5.0, 1.0));
        data.add(new Point("짬뽕", 4.5, 0.5));
        data.add(new Point("짬뽕", 4.5, 0.5));

        // 새 데이터 포인트 (위치만 주어져있고 짜장면, 짬뽕 중 뭘 좋아하는지 모르는 상태)
        Point newPoint = new Point(null, 3.5, 2.0);

        // K 값 설정 (가까운 3개의 이웃)
        int k = 3;

        // KNN 알고리즘
        String predictType = knn(data, newPoint, k);
        System.out.println("예측된 선호: " + predictType);
    }
}
