package portfolio.javamasterclass;

class Mitsubishi extends Car {
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
}
