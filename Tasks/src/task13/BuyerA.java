package task13;

/*
  @author Kirill Maryukhna
 */

public class BuyerA implements Discount, Tax{

    @Override
    public double raschetSkidki(double sumaPokupki, int protzent) {
        return sumaPokupki / 100 * protzent;
    }

    @Override
    public double raschetNaloga(double sumaPokupki, int nalog) {
        return sumaPokupki / 100 * nalog;
    }
}
