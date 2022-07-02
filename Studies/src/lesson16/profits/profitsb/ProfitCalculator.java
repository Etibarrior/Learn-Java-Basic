package lesson16.profits.profitsb;

public class ProfitCalculator {
    // расчёт суммы чистой прибыли (после уплаты налога)
    static double calculateProfitNetto(int sold, double price, double tax) {
        return sold * price - tax;
    }
}
