package lesson04.ctrlstmt;

// использование разновидности for-each цикла for
// для суммирования и отображения значений

public class CtrlStmtC {

    public static void main(String[] args) {

// Пример № 1 (проход по int массиву)
        int[] numsA = {1, 2, 3, 4, 5, 6, 17, 8, 9, 10};
        System.out.println("\n\nПример № 1:");
        int sum = 0;
        for (int x : numsA) {
            System.out.println("Значение: " + x);
            sum += x;
            //sum = sum + x;
        }
        System.out.println("Сумма общая: " + sum);

// Пример № 2 (проход по String массиву)
// вывод через ","
        String[] strsA = {"apple", "orange", "carrot", "potato", "ice cream"};
        System.out.println("\n\nПример № 2:");
        int lenA = strsA.length;
        int countA = 0;
        for(String i : strsA) {
            if (countA < lenA-1)
                System.out.print(i + ", ");
            else
                System.out.print(i);
            countA++;
        }


// Пример № 3 (проход по String массиву c continue)
// вывод через ","
        String[] elsB = {"apple", "orange", "carrot", "potato", "ice cream"};
        System.out.println("\n\nПример № 3:");
        int lenB = elsB.length;
        int countB = 0;
        for(String i : elsB) {
            if (i.equals("potato"))
                continue;
            else if (countB < lenB-2)
                System.out.print(i + ", ");
            else
                System.out.print(i);
            countB++;
        }
    }
}
