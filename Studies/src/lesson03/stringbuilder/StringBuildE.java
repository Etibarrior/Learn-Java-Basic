package lesson03.stringbuilder;

// метод reverse() меняет текущую строку на обратное.
public class StringBuildE {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Апельсин");
        sb.reverse();
        System.out.println(sb);
    }
}
