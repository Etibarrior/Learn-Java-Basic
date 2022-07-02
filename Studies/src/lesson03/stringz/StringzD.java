package lesson03.stringz;

// Выборка подстроки
public class StringzD {

    public static void main(String[] args) {
        String str = "Наша запись - это информация!";

        // Метод substring() выделяет подстроку от символа
        // включительно до символа исключительно.
        String subStrA = str.substring(5, 11);
        String subStrB = str.substring(14);

        System.out.println(subStrA);
        System.out.println(subStrB);
    }
}
