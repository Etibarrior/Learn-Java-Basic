package task02;

public class Personnel {

//    Переменные для сотрудников
    static byte number;
    static String name;
    static String position;
    static double salary;

    public static void main(String[] args) {

    number = 1;
    name = "Сотрудник А";
    position = "продавец";
    salary = 6854.98;
    System.out.println(number + ")" + name + ": Должность-" + position + "; Зарплата = " + salary + "грн.");

    number = 2;
    name = "Сотрудник Б";
    position = "кассир";
    salary = 8758.65;
    System.out.println(number + ")" + name + ": Должность-" + position + "; Зарплата = " + salary + "грн.");

    number = 3;
    name = "Сотрудник В";
    position = "администратор";
    salary = 13658.87;
    System.out.println(number + ")" + name + ": Должность-" + position + "; Зарплата = " + salary + "грн.");
    }
}
