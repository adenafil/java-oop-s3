package pt7;

public class Actor {
    private int x;
    private int y;
    private World world;

    public void act() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void moveLeft(int amount) {
        this.x -= amount;
    }

    public void moveRight(int amount) {
        this.x += amount;
    }
}
