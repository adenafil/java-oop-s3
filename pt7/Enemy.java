package pt7;

import java.util.List;

public class Enemy extends Actor {
    @Override
    public void act() {
        // cek apakah menyentuh user
        List<Actor> actors = getWorld().get(getX(), getY());
        for (Actor actor : actors) {
            if (actor instanceof Player) {
                Player player = (Player) actor;
                player.shrink();
            }
        }
    }
}
