package lesson13.interfaсez.demob;

// Метод по умолчанию (default method)
public interface Movable {

    void move();

    default void moveFast() {
        System.out.println("Двигаюсь быстро");
    }
}
