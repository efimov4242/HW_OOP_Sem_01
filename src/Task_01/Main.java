package Task_01;

public class Main {
    public static void main(String[] args) {
        initData();
        Program program = new Program();
        program.printAllProduct();
    }

    public static void initData(){
        Product product = new Product();
        Food food = new Food("Рис", 17, 1, "уп", "20.04.2024");
        Drink drink = new Drink("Кока-кола", 7, 1, "шт", 0.33);
        ChildrenProduct childrenProduct = new ChildrenProduct("Кукла Барби", 23, 1, "шт", 3, "Нет");
        Diapers diapers = new Diapers("Pampers", 4, 2, "уп", 4, 42, 8, 10, "dfd");
        Egg egg = new Egg("Яйцо куриное", 18, 10, "шт", "10.04.2023", 25);
        HygieneItems hygieneItems = new HygieneItems("Ватные диски", 12, 4, "шт", 50);
        Lemonade lemonade = new Lemonade("Буратино", 1, 4, "шт", 1.5);
        Masks masks = new Masks("3М", 4, 1, "шт", 1);
        Milk milk = new Milk("Домик в деревне", 4, 1, "шт", "21.03.2023", 2.5);
        Pacifier pacifier = new Pacifier("Тёма", 2, 2, "шт", 6, "Да");
        ToiletPaper toiletPaper = new ToiletPaper("Zeva", 4, 4, "рул", 2, 2);
    }
}
