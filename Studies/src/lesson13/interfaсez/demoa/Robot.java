package lesson13.interfaсez.demoa;

public abstract class Robot implements Movable {

    @Override
    public void moveRight() {
        System.out.println("Робот поворачивает вправо.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Робот поворачивает влево.");
    }

}
