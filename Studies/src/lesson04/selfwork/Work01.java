package lesson04.selfwork;

import java.util.Scanner;

public class Work01 {

    static double sales;
    static double salary;

    public static void main(String[] args) {
        sales = getSales();
        salary = getSalary();

        if (sales > 0 & sales <= 10000) {
            salary = salary / 100 * 10 + salary;
            System.out.printf("Размер зарплаты с премией 10%% = %.2f грн.", salary);
        } else
            if (sales > 10000 & sales <= 20000) {
                salary = salary / 100 * 15 + salary;
                System.out.printf("Размер зарплаты с премией 15%% = %.2f грн.", salary);
            } else
                if (sales > 20000) {
                    salary = salary / 100 * 20 + salary;
                    System.out.printf("Размер зарплаты с премией 20%% = %.2f грн.", salary);
                } else
                    System.out.println("Слишком маленький объем продаж");
    }

    public static double getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер зарплаты:");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе зарплаты\n\n");
            return getSalary();
        }
    }

    public static double getSales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер продаж:");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе продаж\n\n");
            return getSales();
        }
    }
}
