package lesson12.abstractclassez.demoe;


public class ProductA extends Product {

    double qnty;
    double price;

    public ProductA(String name, double qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    @Override
    double getCost() {
        return qnty * price;
    }
}
