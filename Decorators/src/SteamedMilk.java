public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .05;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
