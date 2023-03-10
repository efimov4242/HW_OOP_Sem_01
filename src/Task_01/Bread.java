package Task_01;

public class Bread extends Food {
    private String typeOfFlour;

    public Bread(String name, int price, int amount, String unit, String bestBefore, String typeOfFlour) {
        super(name, price, amount, unit, bestBefore);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "typeOfFlour='" + typeOfFlour + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
