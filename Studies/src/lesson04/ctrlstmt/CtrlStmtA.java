package lesson04.ctrlstmt;

// В названии класса присутствует CtrlStmt,
// поскольку данная тема рассматривается в англоязычных
// источниках как Control Statements

// оператор if

public class CtrlStmtA {

    public static void main(String[] args) {

// Пример № 1 (всегда истинно, без альтернативы)
        int a = 15;
        System.out.println("Пример № 1:");
        if( a < 25 ) {
            System.out.println("Наш оператор if.\n");
        }

// Пример № 2 (с альтернативой)
        int b = 95;
        System.out.println("Пример № 2:");
        if( b < 25 ) {
            System.out.println("Значение меньше.\n");
        }else {
            System.out.println("Значение больше.\n");
        }

// Пример № 3 (с альтернативой)
        int c = 95;
        System.out.println("Пример № 3:");
        if( c < 25 ) {
            System.out.println("Значение " + c + " меньше.\n");
        }else if ( c > 25 ) {
            System.out.println("Значение " + c + " больше.\n");
        }else {
            System.out.println("Значения равны.\n");
        }

// Пример № 4 (множественное условие "и" без альтернативы вывода)
// Вывода нет, т.к. &&
        int d = 9;
        int e = 5;
        System.out.println("Пример № 4:\n");
        if(d > e && d < 6) {
            System.out.println("d больше e и больше 6.\n");
        }

// Пример № 5 (множественное условие "или" без альтернативы вывода)
// Вывод есть, т.к. ||
        int f = 9;
        int g = 5;
        System.out.println("Пример № 5:");
        if(f > g || f < 6) {
            System.out.println("f больше g или больше 6.\n");
        }

// Пример № 6 (множественное условие "и" с альтернативой вывода)
        int h = 9;
        int i = 5;
        System.out.println("Пример № 6:");
        if(h > i && h > 6) {
            System.out.println("h больше i и больше 6.\n");
        }else System.out.println("h меньше i и меньше 6.\n");



//  Пример № 7 (многоступенчатая конструция if- else if - else)
//  Вложенный if- else if - else.
        int z;
        System.out.println("Пример № 7:");
        for( z = 1; z < 6; z++ ) {
            if(z == 1)
                System.out.println("z равно 1");
            else if(z == 2)
                System.out.println("z равно 2");
            else if(z == 3)
                System.out.println("z равно 3");
            else if(z == 4)
                System.out.println("z равно 4");
            else
// Условие, выполняемое по умолчанию.
                System.out.println("z не в диапазоне от 1 до 4") ;
        }
    }
}
