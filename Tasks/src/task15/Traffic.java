package task15;

/*
  @author Kirill Maryukhna
 */

public class Traffic {

    static Lights colour;

    public static void main(String[] args) {

        colour = Lights.Green;

        switch (colour){
            case Red -> System.out.println("Стой");
            case Yellow -> System.out.println("Внимание");
            case Green -> System.out.println("Едь");
            default -> System.out.println("Пользуйся знаками");
        }
    }
}
