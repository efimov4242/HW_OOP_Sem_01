package Task_01;

public class Drink extends Product{
    private double volume;

    public Drink(String name, int price, int amount, String unit, double volume) {
        super(name, price, amount, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "volume=" + volume +
                '}';
    }
}
