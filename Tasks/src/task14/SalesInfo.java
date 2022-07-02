package task14;

/*
  @author Kirill Maryukhna
 */

import java.text.DecimalFormat;

public class SalesInfo {

    public static void main(String[] args) {

        SalesData.quantity = 10;
        SalesData.price = 12.5;

        SalesData.showInfo();
    }

    static class SalesData{

       static double sales;
       static String roundSales;
       static int quantity;
       static double price;

        static double calculate(int qnt, double prc){
            return qnt * prc;
        }

        static void showInfo() {
            sales = calculate(quantity, price);
            roundSales = SalesInfo.Rounder.rounding(sales);
            System.out.println("Объем продаж равен: " + roundSales + " грн.");
        }

    }

    static class Rounder {
        public static String rounding(double value) {
            return new DecimalFormat("0.00").format(value);
        }
    }
}
