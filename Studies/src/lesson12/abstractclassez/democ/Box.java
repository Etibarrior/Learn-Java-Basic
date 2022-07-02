package lesson12.abstractclassez.democ;

// Абстрактный класс
// с базовым функционалом
abstract class Box {

    // поля/свойства данного класса
    double width;
    double height;
    double depth;

    // конструктор
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // абстрактный метод
    abstract double getVolume();
}
