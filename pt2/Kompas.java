package pt2;

import javax.swing.plaf.synth.Region;

public class Kompas {
    public static void main(String[] args) {
        Menu otomotif = new Menu();
        otomotif.text = "Otomotif";
        otomotif.url = "https://otomotif.kompas.com/";
        otomotif.urutan = 3;

        Menu motor = new Menu();
        motor.text = "Motor";
        motor.url = "https://otomotif.kompas.com/motor";
        motor.parent = otomotif;
        motor.urutan = 1;

        Menu mobil = new Menu();
        mobil.text = "Mobil";
        mobil.url = "https://otomotif.kompas.com/mobil";
        mobil.parent = otomotif;
        mobil.urutan = 2;


        Menu news = new Menu();
        news.text = "News";
        news.url = "https://news.kompas.com/";
        news.urutan = 1;

        Menu regional = new Menu();
        regional.text = "Regional";
        regional.url = "https://regional.kompas.com/";
        regional.parent = news;
        regional.urutan = 17;
        
        Menu surabaya = new Menu();
        surabaya.text = "Surabaya";
        surabaya.url = "https://regional.kompas.com/surabaya";
        surabaya.parent = regional;
        surabaya.urutan = 1;
        
        System.out.println(surabaya.parent.parent.text);
    }
}

class Menu {
    String text;
    String url;
    int urutan;

    Menu parent;
}

class MenuVlama {
    String text;
    String url;

    Menu[] subMenu;
}
