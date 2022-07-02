package lesson13.interfaсez.democ;

import java.text.DecimalFormat;

// округлитель
public class Rounder {
    public static String roundValue(double num){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(num);
    }
}
