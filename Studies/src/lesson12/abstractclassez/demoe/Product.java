package lesson12.abstractclassez.demoe;

abstract class Product {

    String name;

    public Product(String name) {
        this.name = name;
    }

    abstract double getCost();
}
