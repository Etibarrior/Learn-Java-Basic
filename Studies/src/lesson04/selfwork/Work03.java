package lesson04.selfwork;

public class Work03 {

    public static void main(String[] args) {

        int bals = 3;
        switch (bals) {
            case 4 -> System.out.println("Апельсины");
            case 3 -> System.out.println("Мандарины");
            case 2 -> System.out.println("Арбузы");
            default -> System.out.println("Неизвестно");
        }
    }
}
