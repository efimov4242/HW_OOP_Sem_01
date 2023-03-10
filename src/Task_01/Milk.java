package Task_01;

public class Milk extends Food {
    public double fat;

    public Milk(String name, int price, int amount, String unit, String bestBefore, double fat) {
        super(name, price, amount, unit, bestBefore);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fat=" + fat +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
