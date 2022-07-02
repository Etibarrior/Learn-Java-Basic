package lesson02.selfwork;

public class Work04 {

    static int time;
    static double stavka;
    static double premia;

    public static void main(String[] args) {

        time = 246;
        stavka = 56.40;
        double zarplata = time * stavka;
        premia = (zarplata < 18000) ? 500: 1030;
        System.out.println("Полученная премия = " + premia + " грн.");
    }
}
