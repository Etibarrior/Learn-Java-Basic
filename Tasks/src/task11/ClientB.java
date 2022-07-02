package task11;

/*
  @author Kirill Maryukhna
 */

public class ClientB {

    static String name;
    static int quantity;
    static double price;
    static String email;

    public static void main(String[] args) {
        name = "Адольф";
        quantity = 3;
        price = 12.4;
        email = "Adolf41@rambler.com";

        ClientA show = new ClientA(name,email, quantity,price);
            show.infoPurchase();
    }
}
