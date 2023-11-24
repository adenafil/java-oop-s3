package Rumah;

public class Main {
    public static void main(String[] args) {
        Rumah rumah1 = new Rumah(50000000, true, false, 200, 200, 3);
        Rumah rumah2 = new Rumah(50000000, true, false, 300, 200, 3);
        Rumah rumah3 = new Rumah(50000000, false, true, 400, 200, 3);
        Rumah[] jumlahRumah = new Rumah[3];

        jumlahRumah[0] = rumah1;
        jumlahRumah[1] = rumah2;
        jumlahRumah[2] = rumah3;
        System.out.println("Di jual rumah dengan spek sebagi berikut");

        for (Rumah rumah : jumlahRumah) {
            System.out.println("=====================");
            System.out.println("harga : " + rumah.getHarga());
            System.out.println("luas : " + rumah.getLuas());
            System.out.println("lebar : " + rumah.getLebar());
            System.out.println("Apakah posisinya strategis" + rumah.isStrategis());
            System.out.println("Apakah di perumah ? :" + rumah.isInKomplek());
            System.out.println("jumlah tingkat :" + rumah.getJumlahTingkat());
            System.out.println("=====================");
        }

        System.out.println("Minat ? Hubungi Bapak Usman");
    }
}
