package pt4;

public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    public Waktu(int jam, int menit) {
        this(jam, menit, 0);
    }

    public Waktu(int jam) {
        this(jam, 0, 0);
    }

    public Waktu() {
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        if (0 <= jam && jam <= 23) {
            this.jam = jam;
        }
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        if (0 <= menit && menit <= 59) {
            this.menit = menit;
        }
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        if (0 <= detik && detik <= 59) {
            this.detik = detik;
        }
    }

    @Override
    public String toString() {
        // return "Waktu [jam=" + jam + ", menit=" + menit + ", detik=" + detik + "]";
        return String.format(
            "%02d:%02d:%02d",
            jam, menit, detik
        );
    }

    
}
