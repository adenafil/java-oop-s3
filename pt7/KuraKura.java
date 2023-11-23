package pt7;

public class KuraKura extends Enemy {
    private String nama;
    private boolean movingLeft;

    public KuraKura(String nama) {
        this.nama = nama;
    }

    public KuraKura(String nama, boolean movingLeft) {
        this.nama = nama;
        this.movingLeft = movingLeft;
    }

    @Override
    public void act() {
        super.act();

        if (movingLeft) {
            if (getX() > 0) {
                moveLeft(1);
            } else {
                movingLeft = false;
            }
        } else {
            if (getX() < 10) {
                moveRight(1);
            } else {
                movingLeft = true;
            }
        }
    }
}
