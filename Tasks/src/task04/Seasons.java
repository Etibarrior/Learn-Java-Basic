package task04;

/**
 * @author Kirill Maryukhna
 */

public class Seasons {

    public static void main(String[] args) {

        String season = "Осень";

        switch (season) {

            case "Зима" -> System.out.println("Шуба");
            case "Весна", "Осень" -> System.out.println("Куртка");
            case "Лето" -> System.out.println("Майка");
            default -> System.out.println("Неопределен сезон");
        }
    }
}
