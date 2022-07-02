package lesson08;

// Пример наследования.
// Product - родительский класс.
// ProductData - производный класс.
public class ProductData extends Product {

    // Здесь могут быть переменные этого класса.

    public ProductData(String name, int quantity, double price) {
        // доступ к переменным родительского
        // класса через super
        super(name, quantity, price);
    }

    public void infoProduct() {

        // Локальные переменные этого метода
        // этого класса.
        String name = getName();
        int qnty = getQuantity();
        double price = getPrice();
        double totalSale = calculateSales(qnty,price);

        // Объявление локальной переменной и ее инициализация путем
        // вызова статического метода не через экземпляра класса.
        String resultSale = Rounder.roundValue(totalSale);

        System.out.println(
                "Товар: " + name +
                "\nОбъем продаж (грн.): " + resultSale
        );
    }

    public static double calculateSales(int quota, double price){
        return quota * price;
    }
}
