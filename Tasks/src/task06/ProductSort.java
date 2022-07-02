package task06;

/**
 * @author Kirill Maryukhna
 */

public class ProductSort {

    public static void main(String[] args) {

        String[] product = {"Карандаш", "Ручка", "Фломастер", "Ластик", "Точилка", "Тетрадь в клетку",
                "Тетрадь в линию", "Альбом", "Степлер", "Дырокол"};

        bubbleSort(product);

        int count = 0;
        for (String x : product) {
            count++;
            System.out.println(count + ". " + x);
        }
    }

        private static void bubbleSort (String[] product) {

            int n = product.length;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    String temp = product[j-1];

                    if (temp.compareTo(product[j]) > 0) {
                    temp = product[j];
                    product[j] = product[j-1];
                    product[j-1] = temp;
                    }
                }
            }
        }

}
