package syahrul2309066.soal1_pertemuan8_9;

public class Segitiga extends ObjekGeometris {
    private double sisi1 = 1.0;
    private double sisi2 = 1.0;
    private double sisi3 = 1.0;

    public Segitiga() {}

    public Segitiga(double s1, double s2, double s3) {
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
