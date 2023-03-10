package Task_01;

public class Masks extends HygieneItems {
    public Masks(String name, int price, int amount, String unit, int pieceCount) {
        super(name, price, amount, unit, pieceCount);
    }

    @Override
    public String toString() {
        return "Masks{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
