package lesson12.abstractclassez.demob;

class TransportTest {

    public static void main(String[] args){
        Transport transport = new Plane();
        transport.run();
        transport.changeSpeed();
    }
}
