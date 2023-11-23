package pt7;

import java.util.List;
import java.util.Scanner;

public class Player extends Actor {
    private int size = 1;

    @Override
    public void act() {
        Scanner input = new Scanner(System.in);
        System.out.print(
            "[1] Kiri, [2] Kanan, [3] Serang Kiri, [4] Serang Kanan: "
        );
        int key = input.nextInt();
        if (key == 1) {
            moveLeft(1);
        } else if (key == 2) {
            moveRight(1);
        } else if (key == 3) {
            serang(getX() - 1, getY(), "kiri");
        } else if (key == 4) {
            serang(getX() + 1, getY(), "kanan");
        }
    }

    public void grow() {
        if (size < 3) {
            size++;
            System.out.println("Player is growing");
        } else {
            System.out.println("Max size. Cannot grow anymore");
        }
    }

    public void shrink() {
        size--;
        if (size >= 1) {
            System.out.println("Player is shrinking");
        } else {
            System.out.println("Player died");
            getWorld().remove(this);
        }
    }

    private void serang(int x, int y, String posisi) {
        List<Actor> actors = getWorld().get(x, y);
        boolean success = false;
        for (Actor actor : actors) {
            if (actor instanceof Enemy) {
                System.out.printf(
                    "Berhasil menyerang %s di %s\n",
                    actor.getClass().getName(), posisi
                );
                success = true;
                getWorld().remove(actor);
            }
        }
        if (!success) {
            System.out.println("Gagal menyerang sebelah " + posisi);
        }
    }
}

