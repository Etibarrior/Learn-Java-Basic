package lesson12.abstractclassez.demoe;


public class ProductCost {

    static String name;
    static double quantity;
    static double price;
    static double cost;
    static String roundCost;
    static ProductA productA;

    public static void main(String[] args) {

        name = "Апельсин";
        quantity = 58.85;
        price = 15.99;

        productA = new ProductA(name, quantity, price);
        // расчет
        cost = productA.getCost();
        // округление
        roundCost = Rounder.roundValue(cost);
        // вывод
        System.out.println(name + "\nСтоимость: " + roundCost);
    }
}
