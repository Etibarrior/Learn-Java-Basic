package lesson16.profits.profitsb;

//// Модель

class Product {

    private String name;
    private int qnty;
    private double price;

    public Product(String name, int qnty, double price) {
        this.name = name;
        this.qnty = qnty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
