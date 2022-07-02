package lesson03.selfwork;

public class Work04 {

    static StringBuffer line = new StringBuffer("Стул на столе");

    public static void main(String[] args) {
        line.insert(5,"стоит ");
        System.out.println(line);
    }
}
