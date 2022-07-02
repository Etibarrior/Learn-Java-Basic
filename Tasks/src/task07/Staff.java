package task07;

/*
  @author Kirill Maryukhna
 */

import java.text.DecimalFormat;

public class Staff {

    static String position;
    static String name;
    static String post;
    static double rate;
    static int time;
    static int day;
    static int coefficient;
    static double salary;
    static double prize;
    static String salaryRounder;
    static String prizeRounder;

    public static void assembly() {
        Title();
        showOutputOne();
        showOutputTwo();
        showOutputThree();
    }
    private static void Title() {
        System.out.println("Расчет премий\n\n");
    }

    private static void showOutputOne() {
    position = "1.";
    name = "Иванов И.И.";
    post = "Инженер";
    rate = 70;
    time = 8;
    day = 22;
    coefficient = 10;
    salary = calculateSalary(rate, time, day);
    prize = calculatePrize(salary, coefficient);
    salaryRounder = rounding(salary);
    prizeRounder = rounding(prize);
    printInfo();
    }

    private static void showOutputTwo() {
        position = "2.";
        name = "Петров П.П.";
        post = "Рабочий";
        rate = 39;
        time = 12;
        day = 26;
        coefficient = 5;
        salary = calculateSalary(rate, time, day);
        prize = calculatePrize(salary, coefficient);
        salaryRounder = rounding(salary);
        prizeRounder = rounding(prize);
        printInfo();
    }

    private static void showOutputThree() {
        position = "3.";
        name = "Сидоров С.С.";
        post = "Начальник";
        rate = 96.30;
        time = 7;
        day = 20;
        coefficient = 14;
        salary = calculateSalary(rate, time, day);
        prize = calculatePrize(salary, coefficient);
        salaryRounder = rounding(salary);
        prizeRounder = rounding(prize);
        printInfo();
    }

    private static void printInfo() {
        System.out.println(position + "\n" +  name + "\n" + post + "\nЗаработная плата: "
                + salaryRounder + " грн.\nРазмер премии: "+ prizeRounder + " грн.\n");
    }

    private static double calculateSalary (double rate, int time, int day) {
        return rate * time * day;
    }

    private static double calculatePrize (double salary, int coefficient) {
        return salary / 100 * coefficient;
    }

    private static String rounding(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
