package Titik;

public class Titik {
    private double x;
    private double y;

    public Titik() {
        this.x = 0;
        this.y = 0;
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Titik cerminkanKeSumbuX(double x, double y) {
        return new Titik(x, -y);
    }

    public Titik cerminkanKeSumbuY(double x, double y) {
        return new Titik(-x, y);
    }

    public Titik cerminkanKeSumbuX(Titik titik) { 
        return new Titik(titik.getX(), -titik.getY());
    }

    public Titik cerminkanKeSumbuY(Titik titik) { 
        return new Titik(-titik.getX(), titik.getY());
    }
    


}
