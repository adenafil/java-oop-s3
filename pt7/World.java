package pt7;

import java.util.ArrayList;
import java.util.List;

public class World {
    private int width;
    private int height;
    private List<Actor> actors = new ArrayList<>();
    
    public void addEnemy(Enemy enemy) {

    }

    public void add(Actor actor, int x, int y) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        }

        actor.setX(x);
        actor.setY(y);
        actor.setWorld(this);
    }

    public void remove(Actor actor) {
        actors.remove(actor);
        actor.setWorld(null);
    }

    public List<Actor> get(int x, int y) {
        List<Actor> retActors = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor.getX() == x && actor.getY() == y) {
                retActors.add(actor);
            }
        }
        return retActors;
    }

    public void act() {
        List<Actor> actors2 = new ArrayList<>();
        actors2.addAll(actors);

        for (Actor actor : actors2) {
            if (!actors.contains(actor)) continue;
            
            actor.act();
            System.out.printf(
                "Posisi %s di [%d, %d]\n",
                actor.getClass().getName(),
                actor.getX(), actor.getY()
            );
        }
    }

    public void run() {
        // while (true) {
        //     act();
            
        // }
    }
}
