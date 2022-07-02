package lesson16.profits.profitsa;

public class TaxCalculator {

    // расчёт суммы налога
    static double calculateTax(int sold, double price, double taxRate) {
        return sold * price * taxRate;
    }
}
