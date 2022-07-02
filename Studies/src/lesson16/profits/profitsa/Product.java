package lesson16.profits.profitsa;

// класс-модель
class Product {

    private String name;
    private int qnty;
    private float price;


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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
