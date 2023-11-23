package pt5;

import java.util.ArrayList;
import java.util.List;

enum Kondisi {
    BARU,
    BEKAS
}

public class Produk {
    public static final int BARU = 0;
    public static final int BEKAS = 0;

    private String nama;
    private long hargaAsli;
    private long hargaDiskon;

    private int kondisi;

    private int minimalPemesanan;
    private String etalase;
    private String deskripsi;

    private double rating = -1;
    private List<Ulasan> ulasan = new ArrayList<>();
    private List<Diskusi> diskusi = new ArrayList<>();
    private Kategori kategori;
    private Pengguna penjual;

    public Produk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getHargaAsli() {
        return hargaAsli;
    }

    public void setHargaAsli(long hargaAsli) {
        this.hargaAsli = hargaAsli;
    }

    public long getHargaDiskon() {
        return hargaDiskon;
    }

    public void setHargaDiskon(long hargaDiskon) {
        this.hargaDiskon = hargaDiskon;
    }

    public int getPersentaseDiskon() {
        return (int) Math.ceil(100 - (100.0 * hargaDiskon / hargaAsli));
    }

    public int getKondisi() {
        return kondisi;
    }

    public void setKondisi(int kondisi) {
        this.kondisi = kondisi;
    }

    public int getMinimalPemesanan() {
        return minimalPemesanan;
    }

    public void setMinimalPemesanan(int minimalPemesanan) {
        this.minimalPemesanan = minimalPemesanan;
    }

    public String getEtalase() {
        return etalase;
    }

    public void setEtalase(String etalase) {
        this.etalase = etalase;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getRating() {
        if (rating < 0) {
            double total = 0;
            int count = 0;
            for (Ulasan u : ulasan) {
                total += u.rating;
                count++;
            }

            rating = 0;
            if (count > 0) {
                rating = total / count;
            }
        }

        return rating;
    }

    public List<Ulasan> getUlasan() {
        return ulasan;
    }

    public void addUlasan(Ulasan ulasan) {
        this.ulasan.add(ulasan);
    }

    public List<Diskusi> getDiskusi() {
        return diskusi;
    }

    public void addDiskusi(Diskusi diskusi) {
        this.diskusi.add(diskusi);
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Pengguna getPenjual() {
        return penjual;
    }

    public void setPenjual(Pengguna penjual) {
        this.penjual = penjual;
    }

    
}
