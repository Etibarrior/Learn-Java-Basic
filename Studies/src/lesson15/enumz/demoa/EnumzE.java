package lesson15.enumz.demoa;

// Метод values() возвращает массив, содержащий
// все значения перечисления.
public class EnumzE {

    public static void main(String[] args) {
        // Применение for для вывода
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}
