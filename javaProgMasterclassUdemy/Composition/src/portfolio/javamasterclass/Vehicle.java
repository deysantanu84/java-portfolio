package portfolio.javamasterclass;

public class Vehicle extends Car {
    private int doors;
    private int engineCapacity;

    public Vehicle(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
