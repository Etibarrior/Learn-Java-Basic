package lesson12.abstractclassez.demob;

// Абстрактный класс
// с базовым функционалом
abstract class Transport {

    // конструктор
    Transport() {
        System.out.println("Транспорт подан.");
    }

    // абстрактный метод
    abstract void run();

    // неабстрактный метод
    void changeSpeed() {
        System.out.println("Скорость растет...");
    }

}
