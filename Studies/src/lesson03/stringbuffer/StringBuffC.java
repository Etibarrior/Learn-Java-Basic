package lesson03.stringbuffer;

// метод replace() заменяет строку по указанным
// начальному и конечному индексу
public class StringBuffC {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Апельсин");
        sb.replace(2,4,"Кот");
        System.out.println(sb);
    }
}
