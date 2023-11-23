package pt2;

public class Bangun2DV1 {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        PersegiPanjang pp2 = new PersegiPanjang();
        PersegiPanjang pp3 = new PersegiPanjang();

        pp1.panjang = 4;
        pp1.lebar = 3;
        pp1.diagonal = Math.sqrt(pp1.panjang * pp1.panjang + pp1.lebar * pp1.lebar);
        pp1.keliling = 2 * (pp1.panjang + pp1.lebar);
        pp1.luas = pp1.panjang * pp1.lebar;

        pp2.panjang = 12;
        pp2.lebar = 5;
        pp2.diagonal = Math.sqrt(pp2.panjang * pp2.panjang + pp2.lebar * pp2.lebar);
        pp2.keliling = 2 * (pp2.panjang + pp2.lebar);
        pp2.luas = pp2.panjang * pp2.lebar;

        pp3.panjang = 12;
        pp3.lebar = 5;
        pp3.diagonal = Math.sqrt(pp3.panjang * pp3.panjang + pp3.lebar * pp3.lebar);
        pp3.keliling = 2 * (pp3.panjang + pp3.lebar);
        pp3.luas = pp3.panjang * pp3.lebar;

        System.out.println("PP1");
        System.out.println("Panjang  : " + pp1.panjang);
        System.out.println("Lebar    : " + pp1.lebar);
        System.out.println("Diagonal : " + pp1.diagonal);
        System.out.println("Keliling : " + pp1.keliling);
        System.out.println("Luas     : " + pp1.luas);

        System.out.println("PP2");
        System.out.println("Panjang  : " + pp2.panjang);
        System.out.println("Lebar    : " + pp2.lebar);
        System.out.println("Diagonal : " + pp2.diagonal);
        System.out.println("Keliling : " + pp2.keliling);
        System.out.println("Luas     : " + pp2.luas);

        System.out.println("PP3");
        System.out.println("Panjang  : " + pp3.panjang);
        System.out.println("Lebar    : " + pp3.lebar);
        System.out.println("Diagonal : " + pp3.diagonal);
        System.out.println("Keliling : " + pp3.keliling);
        System.out.println("Luas     : " + pp3.luas);

        pp3.panjang = 60;
        pp3.diagonal = Math.sqrt(pp3.panjang * pp3.panjang + pp3.lebar * pp3.lebar);
        pp3.keliling = 2 * (pp3.panjang + pp3.lebar);
        pp3.luas = pp3.panjang * pp3.lebar;

        System.out.println("PP3");
        System.out.println("Panjang  : " + pp3.panjang);
        System.out.println("Lebar    : " + pp3.lebar);
        System.out.println("Diagonal : " + pp3.diagonal);
        System.out.println("Keliling : " + pp3.keliling);
        System.out.println("Luas     : " + pp3.luas);

    }
}

class PersegiPanjang {
    double panjang;
    double lebar;
    double diagonal;
    double keliling;
    double luas;
}

class Segitiga {

}
