package pt3;

public class OrangTest {
    public static void main(String[] args) {
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.setPasangan(budi);

        print(budi);
        print(ani);
    }

    static void print(Orang o) {
        System.out.println("Nama : " + o.nama);
        if (o.pasangan != null) {
            System.out.println("pasangan : " + o.pasangan.nama);
        } else {
            System.out.println("Pasanagan : -");
        }
    }
}
