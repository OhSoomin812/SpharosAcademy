package org.example.store;

public class DaeguRes extends BasicRes{
    
    public void makeBibim() {
        System.out.println("중화비빔밥");
    }

    @Override
    public void makeZazang() {
        makeBibim();
    }
}
