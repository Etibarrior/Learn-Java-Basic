package task13;

/*
  @author Kirill Maryukhna
 */

import java.text.DecimalFormat;

public class Rounder {

    public static String rounding(double value) {
        return new DecimalFormat("0.00").format(value);
    }
}