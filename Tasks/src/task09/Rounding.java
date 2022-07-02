package task09;

/*
  @author Kirill Maryukhna
  Метод создан для округление до 2х знаков после запятой.
  Метод будет использоваться для других расчетов в дальнейшем.
 */

import java.text.DecimalFormat;

public class Rounding {

    public static String rounding(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}