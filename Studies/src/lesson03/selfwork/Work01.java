package lesson03.selfwork;

public class Work01 {

    static String lineA = "Сравнение";
    static String lineB = "СРАВНЕНИЕ";
    static String lineC = "Строк";

    public static void main(String[] args) {

        System.out.println(lineA.equalsIgnoreCase(lineB));
        System.out.println(lineA.compareToIgnoreCase(lineC));
    }
}




