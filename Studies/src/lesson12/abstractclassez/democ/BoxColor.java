package lesson12.abstractclassez.democ;

// класс наследует абстрактный класс,
// и должен переопределить все методы
// абстрактного класса
public class BoxColor extends Box{

    // поля/свойства данного класса
    String color;

    public BoxColor(int width, int height, int depth, String color) {
        // получение доступа к переменным супер-класса
        super(width, height, depth);
        // определение переменной данного класса
        this.color = color;
    }

    @Override
    double getVolume() {
        return width * height * depth;
    }
}
