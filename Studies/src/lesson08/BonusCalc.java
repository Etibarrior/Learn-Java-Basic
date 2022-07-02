package lesson08;


public class BonusCalc {

    public double infoBonus(int quantity, double price){
        double sales = ProductData.calculateSales(quantity,price);
        double bonus;
        if (sales < 1000){
            bonus = sales * 0.05;
        }else if (sales > 1000 && sales <= 3000){
            bonus = sales * 0.1;
        }else {
            bonus = sales * 0.15;
        }
        return bonus;
    }
}
