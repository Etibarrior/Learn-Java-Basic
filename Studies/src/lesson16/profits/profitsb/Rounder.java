package lesson16.profits.profitsb;

import java.text.DecimalFormat;

public class Rounder {
    // округление суммы
    static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
