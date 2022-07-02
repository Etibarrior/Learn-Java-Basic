package task09;

/*
  @author Kirill Maryukhna
 */

public class ProductA {

    static String name;
    static int pieces;
    static double cost;
    static double income;
    static int coefficient;
    static double tax;
    static String incomeRounder;
    static String taxRounder;

    public static void main(String[] args) {

        Product info = new Product();

        name = "Apple iPhone 13 Pro Ultra";
        pieces = 46;
        cost = 25999.99;
        coefficient = 15;

        info.setProductName(name);
        info.setQuantity(pieces);
        info.setPrice(cost);

        income = calculateIncome (info.getQuantity(), info.getPrice());
        tax = calculateTax (income, coefficient);
        incomeRounder = Rounding.rounding(income);
        taxRounder = Rounding.rounding(tax);

        System.out.println("\"" + info.getProductName() + "\"" +"\nПродано товара: " + info.getQuantity() +
                " шт.\nДоход составил: " + incomeRounder + " грн.\nНалог составил: " + taxRounder + "грн.");
    }

    private static double calculateIncome (int quantity, double price) {
        return quantity * price;
    }

    private static double calculateTax (double income, int tax) {
        return income / 100 * tax;
    }
}
