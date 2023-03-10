package Task_01;

public class Diapers extends HygieneItems {
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diapers(String name, int price, int amount, String unit, int pieceCount, int size, int minWeight,
                   int maxWeight, String type) {
        super(name, price, amount, unit, pieceCount);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "size=" + size +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
