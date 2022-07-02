package lesson13.interfaсez.democ;

// получение и обработка конкретных значений,
// отображение выходных данных
public class CargoInfo {

    private static String company;
    private static int quantity;
    private static double price;
    private static double taxRate;
    private static String roundCost;
    private static String tax;

    public static void main(String[] args){
        initVars();
        handleData();
        showData();
    }

    // получение конкретных значений
    private static void initVars() {
        company = "Sea Lines";
        quantity = 5840;
        price = 159.79;
        taxRate = 2.5;
    }

    // обработка конкретных значений
    private static void handleData() {
        Cargo cargo = new Cargo();
        double cost = cargo.calcCargoCost(quantity, price);
        roundCost = Rounder.roundValue(cost);
        tax = Rounder.roundValue(
                cargo.calcTax(cost,taxRate)
        );
    }

    // выходные данные
    private static void showData() {
        System.out.println("Перевозчик: " + company +
                "\nСтоимость груза (грн.): " + roundCost +
                "\nСумма налога (грн.): " + tax);
    }
}
