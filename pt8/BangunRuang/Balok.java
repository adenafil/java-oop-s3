package BangunRuang;

public class Balok implements BangunRuang {
    double panjang;
    double lebar;
    double tinggi;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }

    @Override
    public double getVolume() {
        return panjang * lebar * tinggi;
    }




    
    
}
