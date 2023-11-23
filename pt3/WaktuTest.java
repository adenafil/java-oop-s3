package pt3;

public class WaktuTest {
    public static void main(String[] args) {
        Waktu pagi = new Waktu(7, 30, 56);
        Waktu pagi2 = new Waktu(7, 67, -99);
        Waktu siang = new Waktu(13, 45);
        Waktu siang2 = new Waktu(13, 78);
        Waktu malam = new Waktu(22);
        Waktu malam2 = new Waktu(28);
        
        print(pagi);
        print(pagi2);
        print(siang);
        print(siang2);
        print(malam);
        print(malam2);
    }

    static void print(Waktu waktu) {
        System.out.printf(
            "%02d:%02d:%02d\n",
            waktu.jam, waktu.menit, waktu.detik
        );
    }
}
