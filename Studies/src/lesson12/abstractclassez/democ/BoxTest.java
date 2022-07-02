package lesson12.abstractclassez.democ;


public class BoxTest {

    static BoxColor colorBox;
    static int width;
    static int height;
    static int depth;
    static String color;

    public static void main(String[] args) {

        width = 25;
        height = 12;
        depth = 20;
        color = "красный";

        colorBox = new BoxColor(width, height, depth, color);

        System.out.println("Объём: " + colorBox.getVolume()
                + "\nЦвет: " + colorBox.color);
    }
}
