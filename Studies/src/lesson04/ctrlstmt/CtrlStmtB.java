package lesson04.ctrlstmt;


// цикл for

public class CtrlStmtB {

    public static void main(String[] args) {

// Пример № 1 (все значения и условия в for())
        System.out.println("\nПример № 1:");
        for (int a = 1; a < 5; a++){
            System.out.println("Наше значение: " + a);
        }

// Пример № 2 (в for() только условие)
        int b = 1;
        System.out.println("\nПример № 2:");
        for (; b < 5;) {
            System.out.println("Наше значение: " + b);
            b++;
        }

/* Пример № 3 (в for() множественные значения и условия).
Инкремент и декремент одновременно.
1-й проход: c == 1, d == 7, true, e == 2, d == 6, output == 7.
2-й проход: c == 1, d == 6, true, e == 3, d == 5, output == 6.
3-й проход: c == 1, d == 5, true, e == 4, d == 4, output == 5.
4-й проход: c == 1, d == 4, false, прекращение цикла.
**/
        int n = 8;
        int e = 1;
        System.out.println("\nПример № 3:");
        for(int c = 1, d = n - 1; e < d; e++, d--) {
            System.out.print((c * d) + " ");
        }

// Пример № 4 (проход по массиву)
// Прекращение выполнения после истинности условия
        int[] numsA = new int[] { 1, 2, 6, 4, 5, 9, 7, 3 };
        int lenA = numsA.length;
        System.out.println("\n\nПример № 4:");
        System.out.println("Длина массива равна " + lenA);
        for (int f = 0; f < lenA; f++) {
            if (numsA[f] > 8)
                break;
            System.out.print(numsA[f] + " ");
        }

// Пример № 5 (проход по массиву)
// Продолжение выполнения после истинности условия
        int[] numsB = new int[] { 1, 2, 6, 4, 5, 9, 7, 3 };
        System.out.println("\n\nПример № 5:");

        for (int g = 0; g < numsB.length; g++) {
            if (numsB[g] > 8)
                continue;
            System.out.print(numsB[g] + " ");
        }

// variant for-each
//        for (int i : numsB) {
//            if (i > 8)
//                continue;
//            System.out.print(i + " ");
//        }

    }
}
