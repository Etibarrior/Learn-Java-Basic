package lesson13.interfaсez.demoa;

public class Auto implements ICargoAuto, PassengersAuto {

    @Override
    public void transportCargo() {
        System.out.println("Везу груз");
    }

    @Override
    public void transportPassengers() {
        System.out.println("Везу пассажиров");
    }
}
