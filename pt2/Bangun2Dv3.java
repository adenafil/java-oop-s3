package pt2;

public class Bangun2Dv3 {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        PersegiPanjang pp2 = new PersegiPanjang();
        PersegiPanjang pp3 = new PersegiPanjang();

        pp1.panjang = 4;
        pp1.lebar = 3;

        pp2.panjang = 12;
        pp2.lebar = 5;

        pp3.panjang = 6;
        pp3.lebar = 8;

        System.out.println("PP1");
        print(pp1);

        System.out.println("PP2");
        print(pp2);

        System.out.println("PP3");
        print(pp3);

        pp3.panjang = 60;

        System.out.println("PP3");
        print(pp3);
        pp3.print();

    }

    public static void print(PersegiPanjang pp) {
        System.out.println("Panjang  : " + pp.panjang);
        System.out.println("Lebar    : " + pp.lebar);
        System.out.println("Diagonal : " + pp.diagonal());
        System.out.println("Keliling : " + pp.keliling());
        System.out.println("Luas     : " + pp.luas());
    }
}

class PersegiPanjang {
    double panjang;
    double lebar;

    // double diagonal;
    double diagonal() {
        return Math.sqrt(
            panjang * panjang + lebar * lebar
        );
    }

    // double keliling;
    double keliling() {
        return 2 * (panjang + lebar);
    }

    // double luas;
    double luas() {
        return panjang * lebar;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    void print() {
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Diagonal : " + diagonal());
        System.out.println("Keliling : " + keliling());
        System.out.println("Luas     : " + luas());
    }
}

class Segitiga {

}