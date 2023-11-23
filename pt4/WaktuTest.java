package pt4;

public class WaktuTest {
    public static void main(String[] args) {
        Waktu pagi1 = new Waktu(7, 30, 56);
        Waktu pagi2 = new Waktu(7, -45, 78);

        // pagi1.jam = 56;
        pagi1.setJam(56);

        // pagi1.menit = 78;
        pagi1.setMenit(78);

        // pagi1.detik = 90;
        pagi1.setDetik(90);

        pagi2.setMenit(12);
        pagi2.setDetik(13);

        System.out.print("pagi1: ");
        print(pagi1);
        print(pagi2);
        System.out.println("pagi1: " + pagi1);
        System.out.println("pagi2: " + pagi2);
    }

    static void print(Waktu w) {
        System.out.printf(
            "%02d:%02d:%02d\n",
            // w.jam, w.menit, w.detik
            w.getJam(), w.getMenit(), w.getDetik()
        );
    }
}
