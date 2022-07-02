package lesson12.abstractclassez.demod;


public class ProductTest {

    static String name;
    static double quantity;
    static double price;
    static double cost;
    static ProductA productA;

    public static void main(String[] args) {

        name = "Апельсин";
        quantity = 128.87;
        price = 34.99;

        productA = new ProductA(quantity, price, name);

        cost = productA.getCost();

        System.out.printf("Продукт: %s%nСтоимость, грн.: %.2f", name, cost);
    }
}
