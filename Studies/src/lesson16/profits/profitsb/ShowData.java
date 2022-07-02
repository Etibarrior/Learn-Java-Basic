package lesson16.profits.profitsb;

import java.util.Scanner;

//// Ввод через Scanner.
//// Вывод через экземпляр класса.

public class ShowData {

    static Scanner scanner;
    static String title;
    static String name;
    static int quantity;
    static double price;
    static int taxRate;

    public static void main(String[] args) {

        title = "Введите наименование товара: ";
        System.out.println(title);
        scanner = new Scanner(System.in);
        name = Validator.validateName(scanner);

        title = "Введите количество: ";
        System.out.println(title);
        scanner = new Scanner(System.in);
        quantity = Validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        System.out.println(title);
        scanner = new Scanner(System.in);
        price = Validator.validatePriceInput(scanner);

        title = "Введите ставку налога (%). Одно из значений - 5, 7, 10: ";
        System.out.println(title);
        scanner = new Scanner(System.in);
        taxRate = Validator.validateTaxRate(scanner);

        ProductHandle product = new ProductHandle(name, quantity, price, taxRate);
        product.handleData();
    }
}
