package pt3;

public class Waktu {
    int jam;
    int menit;
    int detik;

    public Waktu(int jam, int menit, int detik) {
        if (0 <= jam && jam <= 23) {
            this.jam = jam;
        }

        if (0 <= menit && menit <= 59) {
            this.menit = menit;
        }

        if (0 <= detik && detik <= 59) {
            this.detik = detik;
        }
    }

    public Waktu(int jam, int menit) {
        this(jam, menit, 0);
    }

    public Waktu(int jam) {
        this(jam, 0);
    }

    public Waktu() {

    }

    static Waktu buat(int jam, int menit, int detik) {
        Waktu w = new Waktu();
        w.jam = jam;
        w.menit = menit;
        w.detik = detik;
        return w;
    }
}
