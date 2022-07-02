package task10;

/*
  @author Kirill Maryukhna
 */

public class CustomerB {

    static String name;
    static int quantity;

    public static void main(String[] args) {

        name = "Толик";
        quantity = 12;

        Customer info = new Customer(name, quantity);

        System.out.println(info.getName() +"\nКупленно: " + info.getQuantity() + " шт.");
    }
}
