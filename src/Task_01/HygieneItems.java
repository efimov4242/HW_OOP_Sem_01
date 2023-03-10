package Task_01;

public class HygieneItems extends Product{
    private int pieceCount;

    public HygieneItems(String name, int price, int amount, String unit, int pieceCount) {
        super(name, price, amount, unit);
        this.pieceCount = pieceCount;
    }

    @Override
    public String toString() {
        return "HygieneItems{" +
                "pieceCount=" + pieceCount +
                '}';
    }
}
