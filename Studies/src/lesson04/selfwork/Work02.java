package lesson04.selfwork;

import java.util.Locale;

public class Work02 {

    public static void main(String[] args) {

        String color = "Желтый";
        color = color.trim().toLowerCase();
        switch (color) {
            case "красный" -> System.out.println("Стоять");
            case "желтый" -> System.out.println("Приготовиться");
            case "зеленый" -> System.out.println("Можно ехать");
            default -> System.out.println("Неизвестно");
        }
    }
}
