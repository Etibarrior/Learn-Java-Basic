package lesson13.interfaсez.demoa;

public class DemoA {

    public static void main(String[] args) {
        Movable movable = new Transport();
        Transport transport = new Transport();
        Movable robot = new NewRobot();


        // Тут ошибка!!
//        Movable movable1 = new Movable();

        //movable.start();
        movable.moveRight();
        movable.moveLeft();
        System.out.println();

        transport.start();
        transport.moveRight();
        transport.moveLeft();
        transport.stop();
        System.out.println();

        robot.moveLeft();
        robot.moveRight();

    }
}
