package BangunRuang;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========balok=========");

        Balok balok = new Balok();

        balok.setLebar(3);
        balok.setPanjang(3);
        balok.setTinggi(3);

        System.out.println("Terdapat balok dengan spesifikasi sebagi berikut : ");
        System.out.println("Lebar : " + balok.getLebar());
        System.out.println("Panjang : " + balok.getPanjang());
        System.out.println("Tinggi : " + balok.getTinggi());

        System.out.println("Kita bisa mengetahui apa saja luas dan volumenya, berikut saya beri tau!");

        System.out.println("Luas balok : " + balok.getLuas());
        System.out.println("Volume balok : " + balok.getVolume());

        System.out.println("=========balok=========");

        System.out.println("=========Tabung=========");

        Tabung tabung = new Tabung();

        tabung.setR(10);
        tabung.setT(12);

        System.out.println("Abiyu zavero membeli tabung dengan spesifikasi sebagai berikut!");

        System.out.println("R balok " + tabung.getR());
        System.out.println("T balok " + tabung.getR());

        System.out.println("Abiyu sangat bahagia, namun dia bingung karena dia tidak tau luas dan volumenya");

        System.out.println("Berikut luas dan volumenya");

        System.out.println("Luas : " + tabung.getLuas());
        System.out.println("Volume : " + tabung.getVolume());

        System.out.println("=========Tabung=========");

    }

}
