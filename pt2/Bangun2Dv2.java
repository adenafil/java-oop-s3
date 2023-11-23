package pt2;
public class Bangun2Dv2 {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        PersegiPanjang pp2 = new PersegiPanjang();
        PersegiPanjang pp3 = new PersegiPanjang();

        ubahUkuranPersegiPanjang(pp1, 4, 3);
        ubahUkuranPersegiPanjang(pp2, 12, 5);
        ubahUkuranPersegiPanjang(pp3, 6, 8);

        System.out.println("PP1");
        print(pp1);

        System.out.println("PP2");
        print(pp2);

        System.out.println("PP3");
        print(pp3);

        ubahUkuranPersegiPanjang(pp3, 60, pp3.lebar);
        pp3.luas = 123;
        pp3.keliling = 123;
        pp3.diagonal = 123;

        System.out.println("PP3");
        print(pp3);

    }    

    public static void ubahUkuranPersegiPanjang(PersegiPanjang pp, double panjang, double lebar) {
        pp.panjang = panjang;
        pp.lebar = lebar;
        pp.diagonal = Math.sqrt(panjang * panjang + lebar * lebar);
        pp.keliling = 2 * (panjang + lebar);
        pp.luas = panjang * lebar;
    }

    public static void print(PersegiPanjang pp) {
        System.out.println("Panjang  : " + pp.panjang);
        System.out.println("Lebar    : " + pp.lebar);
        System.out.println("Diagonal : " + pp.diagonal);
        System.out.println("Keliling : " + pp.keliling);
        System.out.println("Luas     : " + pp.luas);
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
