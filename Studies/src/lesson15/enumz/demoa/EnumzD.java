package lesson15.enumz.demoa;

// применение switch
public class EnumzD {

    Directions dir;

    public static void main(String[] args) {

        EnumzD obj1 = new EnumzD(Directions.EAST);
        obj1.getDirection();

        EnumzD obj2 = new EnumzD(Directions.SOUTH);
        obj2.getDirection();
    }

    public EnumzD(Directions dir) {
        this.dir = dir;
    }

    public void getDirection() {

        switch(dir) {
            case EAST:
                System.out.println("Направление East");
                break;
            case WEST:
                System.out.println("Направление West");
                break;
            case NORTH:
                System.out.println("Направление North");
                break;
            default:
                System.out.println("Направление South");
                break;
        }

        // улучшенная реализация switch
//        switch(dir) {
//            case EAST -> System.out.println("Направление East");
//            case WEST -> System.out.println("Направление West");
//            case NORTH -> System.out.println("Направление North");
//            default -> System.out.println("Направление South");
//        }
    }
}
