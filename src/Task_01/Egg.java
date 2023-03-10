package Task_01;

public class Egg extends Food {
    private int pieceAmount;


    public Egg(String name, int price, int amount, String unit, String bestBefore, int pieceAmount) {
        super(name, price, amount, unit, bestBefore);
        this.pieceAmount = pieceAmount;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "pieceAmount=" + pieceAmount +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
