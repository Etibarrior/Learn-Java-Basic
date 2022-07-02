package lesson12.abstractclassez.demod;


abstract class Product {

    double quantity;
    double price;

    public Product(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    abstract double getCost();
}
