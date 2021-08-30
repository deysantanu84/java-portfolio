package portfolio.javamasterclass;

public class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height >= 0) ? height : 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.height * this.getArea();
    }
}
