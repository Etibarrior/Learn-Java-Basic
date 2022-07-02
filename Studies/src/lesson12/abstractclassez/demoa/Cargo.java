package lesson12.abstractclassez.demoa;

// класс наследует абстрактный класс,
// и должен переопределить все методы
// абстрактного класса
class Cargo extends Transport {

    public static void main(String[] args){
        Transport transport = new Cargo();
        transport.run();
    }

    // переопределение абстрактного метода
    @Override
    void run() {
        System.out.println("Везу груз...");
    }
}
