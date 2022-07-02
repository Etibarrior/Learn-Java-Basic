package lesson03.stringbuilder;

// изменение строки через append()
public class StringBuildA {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Апельсин ");
        sb.append("очень вкусный");
        System.out.println(sb);
    }
}
