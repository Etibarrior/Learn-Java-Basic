package task10;

/*
  @author Kirill Maryukhna
 */

import task09.Rounding;

public class CustomerA {

    private final static double percentDiscount =5.3;
    static String name;
    static int quantity;
    static double price;
    static double sum;
    static double discount;
    static String sumRounder;
    static String discountRounder;

    public static void main(String[] args) {

        name = "Анатолий";
        quantity = 102;
        price = 124.46;

        Customer info = new Customer(name, quantity, price);

        sum = calcilateSum(info.getQuantity(), info.getPrice());
        discount = calcilateDiscount(sum, percentDiscount);
        sumRounder = Rounding.rounding(sum);            //Класс для кругление в task09
        discountRounder = Rounding.rounding(discount);  //Нет необходимости дублировать его в этом пакете.

        System.out.println("Имя покупателя: " + info.getName() +"\nКоличество купленного товара: "
                + info.getQuantity() + " шт.\nСумма полупки: " + sumRounder
                + " грн.\nСкидка: " + discountRounder + " грн.");
    }

    private static double calcilateSum (int quantity, double price) {
        return quantity * price;
    }

    private static double calcilateDiscount (double sum, double percentDiscount) {
        return sum / 100 * percentDiscount;
    }
}
