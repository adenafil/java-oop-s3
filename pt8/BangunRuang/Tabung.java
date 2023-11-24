package BangunRuang;

public class Tabung implements BangunRuang {
    double r;
    double t;

    public double getR() {
        return r;
    }

    public double getT() {
        return t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double getLuas() {
        return Math.PI * (r * r) * t;
    }

    @Override
    public double getVolume() {
        return (2 *  (Math.PI * (r * r))) + ((2 * Math.PI * r) * t);
    }
    
}
