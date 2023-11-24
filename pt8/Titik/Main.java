package Titik;

public class Main {
    public static void main(String[] args) {
        Titik titik = new Titik(3, 2);

        System.out.print(titik.getX() + " ");
        System.out.println(titik.getY());

        Titik result = new Titik().cerminkanKeSumbuX(titik);

        System.out.print(result.getX() + " ");
        System.out.println(result.getY());
    }
}
