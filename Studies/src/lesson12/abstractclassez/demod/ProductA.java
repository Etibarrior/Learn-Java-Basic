package lesson12.abstractclassez.demod;


public class ProductA extends Product {

    String name;

    public ProductA(double quantity, double price, String name) {
        super(quantity, price);
        this.name = name;
    }

    @Override
    double getCost() {
        return quantity * price;
    }
}
