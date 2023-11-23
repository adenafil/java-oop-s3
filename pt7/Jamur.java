package pt7;

import java.util.List;

public class Jamur extends Item {
    @Override
    public void act() {
        List<Actor> actors = getWorld().get(getX(), getY());
        for (Actor actor : actors) {
            if (actor instanceof Player) {
                Player player = (Player) actor;
                player.grow();
                getWorld().remove(this);
            }
        }
    }
}
