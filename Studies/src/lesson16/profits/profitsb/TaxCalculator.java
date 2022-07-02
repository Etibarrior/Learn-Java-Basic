package lesson16.profits.profitsb;

public class TaxCalculator {

    // расчёт суммы налога
    static double calculateTax(int sold, double price, int taxRate) {
        return sold * price * taxRate / 100;
    }
}
