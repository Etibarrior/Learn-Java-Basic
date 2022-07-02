package task11;

/*
  @author Kirill Maryukhna
 */

public class ClientA extends Client {

    static int quantity;
    static double price;
    static double discount;

    public ClientA (String name, String email, int quantity, double price) {
        super(name,email);
        this.quantity = quantity;
        this.price = price;
    }

    public void infoPurchase () {
        discount = 2.5;
        double purc = sumPurchase(quantity,price);
        double disc = sumDiscout(purc,discount);
        String purchaseRounder = Rounder.rounding(purc);
        String discountRounder = Rounder.rounding(disc);
        System.out.println("Имя покупателя: " + getName() + "\nЭ-почта: " + getEmail() +
                "\nКоличество товара: " + quantity + " шт.\nСумма покупки: " + purchaseRounder +
                " грн.\nСумма скидки: " + discountRounder + " грн.");
    }

    private static double sumPurchase (int quantity, double price) {
        return price * quantity;
    }

    private static double sumDiscout (double purch, double discount) {
        return purch / 100 * discount;
    }
}
