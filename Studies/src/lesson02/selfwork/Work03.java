package lesson02.selfwork;

public class Work03 {

    static double zenaA;
    static double zenaB;
    static int nameA;
    static double nameB;

    public static void main(String[] args) {

        zenaA = 10.50;
        nameA = 45;
        double sumA = zenaA * nameA;
        System.out.println("Стоимость штучного товара " + sumA + "грн, за" + nameA + " шт.");

        zenaB = 11.60;
        nameB = 9.4;
        double sumB = zenaB * nameB;
        System.out.println("Стоимость нештучного товара " + sumB + "грн, за" + nameB + " кг");

        double sumC = sumA + sumB;
        System.out.println("Общая сумма = " + sumC + " грн");
    }
}
