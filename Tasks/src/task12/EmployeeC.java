package task12;

/*
  @author Kirill Maryukhna
 */

public class EmployeeC {

    static String name;
    static String position;
    static int time;
    static double rate;
    static double calculationWegs;
    static String rounder;

    public static void main(String[] args) {

        String phoneNumber = "8-800-555-35-35";
        name = "Алексей";
        position = "Банкир";
        time = 120;
        rate = 59.63;

        EmployeeB employeeB = new EmployeeB(name, position,time, rate);
        calculationWegs = employeeB.calculationWeges();
        rounder = Rounder.rounding(calculationWegs);
        System.out.println("Информация о работнике:\n" + "\nИмя работника: " + name + "\nДолжность: " + position +
                "\nНомер телефона: " + phoneNumber + "\nРазмер заработной платы: " + rounder + " грн.");
    }
}
