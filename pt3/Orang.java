package pt3;

public class Orang {
    String nama;
    Orang pasangan;

    public Orang(String nama) {
        this.nama = nama;
    }

    void setPasangan(Orang o) {
        // ANi pasanganya = budi
        this.pasangan = o;
        // Budi pasanagan ani
        o.pasangan = this;
    }
}
