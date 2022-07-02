package lesson03.stringbuilder;

// метод replace() заменяет строку по указанным
// начальному и конечному индексу
public class StringBuildC {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Апельсин");
        sb.replace(2,4,"Кот");
        System.out.println(sb);
    }
}
