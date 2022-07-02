package lesson16.profits.profitsa;

// импорт встроенного пакета
import java.util.Scanner;

// импорт пользовательского пакета,
// статический импорт
import static lesson16.profits.profitsa.Rounder.*;
import static lesson16.profits.profitsa.Validator.*;

// Ввод через Scanner и некоторая валидация значений.
// Не решено: пустота ввода количества и цены.

public class ProductInputShow {

    static Scanner productName;
    static String name;
    static Scanner productSold;
    static int quantity;
    static Scanner productPrice;
    static float price;
    static float taxRate;
    static double tax;
    static double profit;
    static String taxResult;
    static String profitResult;
    static Product product;
    static String nameOutput;
    static int qntyOutput;

    public static void main(String[] args) {

        productName = new Scanner(System.in);
        System.out.println("Введите наименование товара: ");
        name = validateName(productName);

        productSold = new Scanner(System.in);
        System.out.println("Введите количество: ");
        quantity = validateQuantityInput(productSold);

        productPrice = new Scanner(System.in);
        System.out.println("Введите цену: ");
        price = validatePriceInput(productPrice);

        taxRate = 0.15f;
        tax = TaxCalculator.calculateTax(quantity, price, taxRate);
        profit = ProfitCalculator.calculateProfitNetto(quantity, price, tax);

        // округление денежных выражений
        taxResult = roundValue(tax);
        profitResult = roundValue(profit);

        // создаём экземпляр класса-конструктора
        product = new Product();

        // Так как применяется конструктор по умолчанию,
        // устанавливаем значения через setters.
        product.setName(name);
        product.setQnty(quantity);
        product.setPrice(price);

        // Получение значения через getters.
        nameOutput = product.getName();
        qntyOutput = product.getQnty();

        // вывод результатов в консоль
        System.out.println(
                "Наименование товара: " + nameOutput + '\n' +
                "Товара продано: " + qntyOutput + " шт." + '\n' +
                "Чистая прибыль: " + profitResult + " грн." + '\n' +
                "Сумма налога: " + taxResult + " грн."
        );
    }

}
