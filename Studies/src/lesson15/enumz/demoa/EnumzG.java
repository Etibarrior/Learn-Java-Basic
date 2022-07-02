package lesson15.enumz.demoa;

// Метод enum valueOf() помогает преобразовать
// строку в экземпляр enum.
public class EnumzG {

    public static void main(String[] args) {
        Directions east = Directions.valueOf("EAST");
        System.out.println(east);
    }
}
