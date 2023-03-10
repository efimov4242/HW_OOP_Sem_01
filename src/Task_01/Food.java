package Task_01;

public class Food extends Product{
    private String bestBefore;

    public Food(String name, int price, int amount, String unit, String bestBefore) {
        super(name, price, amount, unit);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return "Food{" +
                "bestBefore='" + bestBefore + '\'' +
                '}';
    }
}
