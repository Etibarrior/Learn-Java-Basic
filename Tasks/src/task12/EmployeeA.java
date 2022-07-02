package task12;

/*
  @author Kirill Maryukhna
 */

abstract class EmployeeA {

    String name;
    String position;

    public EmployeeA(String name, String position) {
        this.name = name;
        this.position = position;
    }

    abstract double calculationWeges();
}