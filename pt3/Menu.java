package pt3;

public class Menu {
    String text;
    String url;
    Menu parent;

    public Menu(String text, String url, Menu parent) {
        this.text = text;
        this.url = url;
        this.parent = parent;
    }

    public Menu(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public Menu() {

    }
}
