package Task_01;

public class ToiletPaper extends HygieneItems {
    private int layerCount;
    public ToiletPaper(String name, int price, int amount, String unit, int pieceCount, int layerCount) {
        super(name, price, amount, unit, pieceCount);
        this.layerCount = layerCount;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" +
                "layerCount=" + layerCount +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
