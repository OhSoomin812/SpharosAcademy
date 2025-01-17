package org.example.store;

public class BusanRes extends BasicRes{
    
    public void makeGanZZ() {
        System.out.println("간짜장");
    }

    @Override
    public void makeZazang() {
        makeGanZZ();
    }
}
