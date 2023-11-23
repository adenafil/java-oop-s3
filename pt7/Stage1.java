package pt7;

public class Stage1 extends World {
    public Stage1() {
        setup();
    }

    private void setup() {
        Player mario = new Player();
        KuraKura kura1 = new KuraKura("Kura-kura 1", true);
        KuraKura kura2 = new KuraKura("Kura-kura 2");
        Jamur jamur = new Jamur();

        add(mario, 0, 0);
        add(kura1, 3, 0);
        add(kura2, 4, 0);
        add(jamur, 9, 0);
    }
}
