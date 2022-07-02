package lesson13.interfaсez.demod;

// Класс реализует несколько интерфейсов

public class SellerAA implements IBonus,IDiscount{

    private static String name;
    private static String email;
    private static String phone;
    private static String productName;
    private static int quantity;
    private static double price;
    private static double bonusResult;
    private static double discountResult;
    private static String roundBonus;
    ProductA saleCalc;
    ProductA product;
    double sales;
    double bonus;
    double discount;
    SellerA seller;


    public void showInfoA() {
        initVars();
        showTitle();
        processData();
        showBonusAndDiscount();
    }

    // инициализация переменных
    private void initVars() {
        name = "Григорий";
        email = "georg@mail.net";
        phone = "055 123-4567";
        productName = "апельсины";
        quantity = 267;
        price = 17.99;
    }

    private static void showTitle(){
        System.out.println(
                "ПРОДАЖИ"
                + "\n-----------------------------"
        );
    }

    private static void showBonusAndDiscount() {
        // Переменная типа double конвертируется в
        // переменную типа String с целью замены "." на ","
        // для идентичности представления числовых значений
        // при выводе.
        String discount = Double.toString(discountResult)
                .replace(".",",");
        System.out.println(
                "Бонус (грн.): " + roundBonus +
                "\nСкидка (%): " + discount +
                "\n-----------------------------"
        );
    }

    private void processData(){
        // вызовы методов через экземпляры классов
        seller = new SellerA(name,phone,email);
        // вывод неверных данных
        //seller = new SellerA(name,email,phone);
        seller.infoSeller();
        product = new ProductA(productName,quantity,price);
        product.infoProduct();
        // расчет бонуса
        bonusResult = calcBonus();
        // округление бонуса
        roundBonus = Rounder.roundValue(bonusResult);
        // установление дисконта
        discountResult = calcDiscount();
    }

    @Override
    public double calcBonus() {
        saleCalc = new ProductA(quantity,price);
        sales = saleCalc.calcSales(quantity,price);
        if (sales < 1000){
            bonus = sales * 0.05;
        }else if (sales > 1000 && sales <= 3000){
            bonus = sales * 0.1;
        }else {
            bonus = sales * 0.15;
        }
        return bonus;
    }

    @Override
    public double calcDiscount() {
        saleCalc = new ProductA(quantity,price);
        sales = saleCalc.calcSales(quantity,price);
        if (sales < 1000){
            discount = 5.5;
        }else if (sales > 1000 && sales <= 3000){
            discount = 10.5;
        }else {
            discount = 15.7;
        }
        return discount;
    }
}
