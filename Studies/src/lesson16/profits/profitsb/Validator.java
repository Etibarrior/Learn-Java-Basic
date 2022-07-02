package lesson16.profits.profitsb;

import java.util.Scanner;

//// Ввод через Scanner и некоторая валидация значений.
//// Не решено: пустота ввода количества и цены.

public class Validator {

    //// валидация ввода наименования
    static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()){
            System.out.println("Пусто!! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    //// валидация ввода количества
    static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество !!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Неверное значение!! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество !!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    //// валидация ввода цены
    static double validatePriceInput(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену !!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0){
            System.out.println("Неверное значение!! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите цену !!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }


    //// валидация ввода ставки налога
    static int validateTaxRate(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите ставку налога !!: ");
        }
        int taxRate = scanner.nextInt();
        while (taxRate <5 || taxRate == 6 || taxRate >7 && taxRate <10 || taxRate>10){
            System.out.println("Неверное значение!! Введите ставку налога: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите ставку налога !!: ");
            }
            taxRate = scanner.nextInt();
        }
        return taxRate;
    }
}
