package Rumah;

public class Rumah {
    private int harga;
    private boolean isInKomplek;
    private boolean isStrategis;
    private int lebar;
    private int luas;
    private int jumlahTingkat;

    public Rumah(int harga, boolean isInKomplek, boolean isStrategis, int lebar, int luas, int jumlahTingkat) {
        this.harga = harga;
        this.isInKomplek = isInKomplek;
        this.isStrategis = isStrategis;
        this.lebar = lebar;
        this.luas = luas;
        this.jumlahTingkat = jumlahTingkat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public boolean isInKomplek() {
        return isInKomplek;
    }

    public void setInKomplek(boolean isInKomplek) {
        this.isInKomplek = isInKomplek;
    }

    public boolean isStrategis() {
        return isStrategis;
    }

    public void setStrategis(boolean isStrategis) {
        this.isStrategis = isStrategis;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getJumlahTingkat() {
        return jumlahTingkat;
    }

    public void setJumlahTingkat(int jumlahTingkat) {
        this.jumlahTingkat = jumlahTingkat;
    }
    
}
