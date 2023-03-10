package Task_01;

public class Pacifier extends ChildrenProduct{

    public Pacifier(String name, int price, int amount, String unit, int minAge, String hypoallergenic) {
        super(name, price, amount, unit, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Pacifier{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
