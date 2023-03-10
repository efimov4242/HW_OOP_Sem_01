package Task_01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Food("Рис", 17, 1, "уп", "20.04.2024"));
        products.add(new Drink("Кока-кола", 7, 1, "шт", 0.33));
        products.add(new ChildrenProduct("Кукла Барби", 23, 1, "шт", 3, "Нет"));
        products.add(new Diapers("Pampers", 4, 2, "уп", 4, 42, 8, 10, "dfd"));
        products.add(new Egg("Яйцо куриное", 18, 10, "шт", "10.04.2023", 25));
        products.add(new HygieneItems("Ватные диски", 12, 4, "шт", 50));
        products.add(new Lemonade("Буратино", 1, 4, "шт", 1.5));
        products.add(new Masks("3М", 4, 1, "шт", 1));
        products.add(new Milk("Домик в деревне", 4, 1, "шт", "21.03.2023", 2.5));
        products.add(new Pacifier("Тёма", 2, 2, "шт", 6, "Да"));
        products.add(new ToiletPaper("Zeva", 4, 4, "рул", 2, 2));

        Program program = new Program();
        program.printAllProduct(products);

    }
}
