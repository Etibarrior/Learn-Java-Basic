package lesson16.profits.profitsb;


//// импорт
import static lesson16.profits.profitsb.Rounder.roundValue;
import static lesson16.profits.profitsb.TaxCalculator.calculateTax;

//// Пример наследования.
public class ProductHandle extends Product {

    double tax;
    double profit;
    String taxResult;
    String profitResult;
    int taxRate;

    //// Получаем доступ к полям родительского класса через super
    public ProductHandle(String name, int qnty, double price, int taxRate) {
        super(name, qnty, price);
        this.taxRate = taxRate;
    }

    public void handleData() {

        //// подсчет значений
        // вызов метода через точечную нотацию
        // tax = TaxCalculator.calculateTax(getQnty(), getPrice(), taxRate);
        // вызов метода статический импорт
        tax = calculateTax(getQnty(), getPrice(), taxRate);
        profit = ProfitCalculator.calculateProfitNetto(getQnty(), getPrice(), tax);

        //// округление денежных выражений
        // вызов метода статический импорт
        taxResult = roundValue(tax);
        profitResult = roundValue(profit);

        //// вывод значений, применяем getters
        System.out.println(
                "Наименование товара: " + getName() + '\n' +
                "Товара продано: " + getQnty() + " шт." + '\n' +
                "Чистая прибыль: " + profitResult + " грн." + '\n' +
                "Сумма налога: " + taxResult + " грн."
        );

    }
}
