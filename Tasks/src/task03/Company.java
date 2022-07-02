package task03;

/**
 * @author Kirill Maryukhna
 * @version это версия IDEA или JDK?
 */

public class Company {

    public static void main(String[] args) {

        StringBuilder com = new StringBuilder("Банан,Ltd");
        com.replace(0,(com.length()),"Батон,Ltd");
        System.out.println(com);
    }
}
