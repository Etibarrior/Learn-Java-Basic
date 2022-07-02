package task12;

/*
  @author Kirill Maryukhna
 */

public class EmployeeB extends EmployeeA{

    int time;
    double rate;

    public EmployeeB(String name, String position, int time, double rate) {
        super(name, position);
        this.time = time;
        this.rate = rate;
    }

    @Override
    double calculationWeges() {
        return time * rate;
    }
}
