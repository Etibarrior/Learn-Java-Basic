package lesson02.selfwork;

public class Work01 {
    static String a;
    static int b;
    static double c;

    public static void main(String[] args) {
        a = "whot?";
        b = 18;
        c = 34.567;
        System.out.println(a + b + c);

        a = "name";
        b = ++b;
        c = c+12.3;
        System.out.printf("%s, %d, %.2f %n", a, b, c);

        a = "Ваня";
        b = b+b*2;
        c = c - 10;
        System.out.println(a + b + c);
    }
}
