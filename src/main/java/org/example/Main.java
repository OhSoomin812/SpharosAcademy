package org.example;

import org.example.ex.Ex1;
import org.example.ex2.CalcImpl;
import org.example.ex2.Calculator;
import org.example.menu.*;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

//        ArrayList<BasicRes> resList = new ArrayList<>();
//
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r -> r.makeZazang());
//
//        // =================================================================
//
//        HashMap<String, String> wordMap = new HashMap<>();
//        wordMap.put("사과", "apple");
//        wordMap.put("복숭아", "peach");
//
//        String engWord = wordMap.get("사과");
//        System.out.println(engWord);
//
//        // =================================================================
//        HashMap<String, BasicRes> resMap = new HashMap<>();
//        resMap.put("서울", new BasicRes());
//        resMap.put("부산", new BusanRes());
//        resMap.put("대구", new DaeguRes());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("도시를 입력하세요: ");
//        String city = scanner.nextLine();
//
//        BasicRes target = resMap.get("city");
//        target.makeZazang();
//
//        // =================================================================
//
//        // 추상 클래스는 객체 생성 불가
//        // 물려주거나 타입으로는 유용
//        Menu[] m = new Menu[10];
//        Menu m2 = new Coffee();
//
//        // =================================================================

        Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();
//        System.out.println(doc);

        Element element = doc.selectFirst("#masonry-container");
//        System.out.println(element);

        Elements names = element.select("h4");
//        System.out.println(names);

        List<String> nameList = names.eachText();
        System.out.println(nameList);

        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
        Document doc2 = Jsoup.connect(url).get();

        Element element2 = doc2.selectFirst("#menu_list");
        Elements names2 = element2.select(".text1 b");
        List<String> nameList2 = names2.eachText();
        System.out.println(nameList2);

        // =================================================================

        HashMap<String, MenuService> map = new HashMap<>();

        map.put("mega", new MegaMenuService());
        map.put("compose", new ComposeMenuService());

        MenuService menuService = map.get("mega");
        menuService.getMenuList();

        // =================================================================

        Ex1 obj1 = new Ex1();
        Ex1 obj2 = new Ex1();

        // =================================================================

        Calculator cal = new CalcImpl();

        List<LottoBall> ballList = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            ballList.add(new LottoBall(i));
        }

        Collections.shuffle(ballList);

        List<LottoBall> result = ballList.subList(0, 6);
        result.sort( (b1, b2) -> b1.getNum() - b2.getNum() );
        System.out.println(result);

    }
}