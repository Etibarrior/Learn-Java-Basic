package task05;

/**
 * @author Kirill Maryukhna
 */

public class Order {

    public static void main(String[] args) {

        String[] product = {"Карандаш", "Ручка", "Фломастер", "Ластик", "Точилка", "Тетрадь в клетку",
                "Тетрадь в линию", "Альбом"};
        int count = 0;
        for (String x: product) {
            count++;
            System.out.println(count + ". " + x);
        }
    }
}
