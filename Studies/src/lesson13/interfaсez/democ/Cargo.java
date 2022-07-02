package lesson13.interfaсez.democ;

// конкретный функционал, где
// непосредственно производятся расчеты
public class Cargo implements ITax {

    double calcCargoCost(int qnty, double price){
        return qnty * price;
    }

    @Override
    public double calcTax(double cost, double taxRate) {
        return cost * taxRate / 100;
    }
}
