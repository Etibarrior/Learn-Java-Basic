package lesson03.stringbuilder;

// метод insert() вставляет определенную строку
// в заданную позицию.
public class StringBuildB {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Апельсин ");
        sb.insert(2,"Кот");
        System.out.println(sb);
    }
}
