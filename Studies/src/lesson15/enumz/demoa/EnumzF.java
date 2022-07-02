package lesson15.enumz.demoa;

// Получение доступа к константе
// перечисления и методу.
public class EnumzF {

    static Directs dir1;
    static Directs dir2;

    public static void main(String[] args) {

        dir1 = Directs.NORTH;
        System.out.println(dir1.getDirection());

        dir2 = Directs.EAST;
        System.out.println(dir2.getDirection());
    }
}
