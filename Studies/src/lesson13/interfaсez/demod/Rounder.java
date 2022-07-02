package lesson13.interfaсez.demod;

import java.text.DecimalFormat;

// Выполняет только одну задачу -
// округляет до 2-х знаков после
// десятичного разделителя.

public class Rounder {
    public static String roundValue(double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
