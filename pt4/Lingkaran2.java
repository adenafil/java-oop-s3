package pt4;

public class Lingkaran2 {
    private double radius;
    private double diameter;
    private double keliling;
    private double luas;

    public Lingkaran2(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.keliling = Math.PI * radius * 2;
        this.luas = Math.PI * radius * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
        this.keliling = Math.PI * radius * 2;
        this.luas = Math.PI * radius * radius;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
        this.radius = keliling / Math.PI / 2;
        this.diameter = radius * 2;
        this.luas = Math.PI * radius * radius;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
        this.radius = Math.sqrt(luas / Math.PI);
        this.diameter = radius * 2;
        this.keliling = Math.PI * radius * 2;
    }

    public String toString() {
        return String.format(
            "Lingkaran2 [r=%.2f, d=%.2f, k=%.2f, l=%.2f]",
            getRadius(), getDiameter(), getKeliling(), getLuas()
        );
    }
}

