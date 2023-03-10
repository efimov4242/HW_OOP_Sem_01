package Task_01;

public class ChildrenProduct extends Product{
    private int minAge;
    private String hypoallergenic;
    public ChildrenProduct(String name, int price, int amount, String unit, int minAge, String hypoallergenic) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return "ChildrenProduct{" +
                "minAge=" + minAge +
                ", hypoallergenic='" + hypoallergenic + '\'' +
                '}';
    }
}
