package Komentar;

public class Main {
    public static void main(String[] args) {
        Komentar komentar = new Komentar("Ade", "wadidaw");

        System.out.println(komentar.getUsername());
        System.out.println(komentar.getTeks());
        System.out.println(komentar.getWaktuPembuatan());
    }
}
