package Task_01;

public class Lemonade extends Drink{
    public Lemonade(String name, int price, int amount, String unit, double volume) {
        super(name, price, amount, unit, volume);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
