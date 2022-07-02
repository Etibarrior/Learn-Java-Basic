package lesson13.interfaсez.demod;

// Класс наследует класс, и реализует интерфейс

public class ProductA extends Product implements ISales {

// объявление переменных
    private String name;
    private int qnty;
    private double price;
    private double totalSale;
    private String resultSale;

// конструктор, переменные супер-класса
    public ProductA(int quantity, double price) {
        super(quantity, price);
    }

    public ProductA(String name, int quantity, double price) {
        super(name, quantity, price);
    }

// готовим данные на вывод в консоль
     public void infoProduct(){
        name = getName();
        qnty = getQuantity();
        price = getPrice();
        totalSale = calcSales(qnty,price);
        resultSale = Rounder.roundValue(totalSale);
        System.out.println(
                "Товар: " + name +
                "\nОбъем продаж (грн.): " + resultSale
        );
    }

// метод интерфейса
    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }
}
