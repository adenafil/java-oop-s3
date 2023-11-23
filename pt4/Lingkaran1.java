package pt4;

public class Lingkaran1 {
    private double r;

    public Lingkaran1(double radius) {
        this.r = radius;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double radius) {
        this.r = radius;
    }

    public double getDiameter() {
        return r * 2;
    }

    public void setDiameter(double diameter) {
        setRadius(diameter / 2);
    }

    public double getKeliling() {
        return Math.PI * r * 2;
    }

    public void setKeliling(double keliling) {
        setRadius(keliling / Math.PI / 2);
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    public void setLuas(double luas) {
        setRadius(Math.sqrt(luas / Math.PI));
    }

    public String toString() {
        return String.format(
            "Lingkaran1 [r=%.2f, d=%.2f, k=%.2f, l=%.2f]",
            getRadius(), getDiameter(), getKeliling(), getLuas()
        );
    }
}
