package task13;

/*
  @author Kirill Maryukhna
 */

public class BuyerB {

    static String imya;
    static int kolichestvo;
    static double tzena;
    static double sumaPokupki;
    static int skidka;
    static double raschetSkidki;
    static int nalog;
    static double raschetNaloga;
    static String okruglenaySuma;
    static String okruglenaySkidka;
    static String okruglenuiqNalog;

    public static void main(String[] args) {
        ishodnieDannue();
        obrabotka();
        vuvod();
    }

    static void ishodnieDannue(){
        imya = "Артур";
        kolichestvo = 89;
        tzena = 56.45;
        skidka = 15;
        nalog = 20;
    }

    static void obrabotka(){
        sumaPokupki = raschetPokupki(kolichestvo, tzena);
        BuyerA pokupatel = new BuyerA();
        raschetSkidki = pokupatel.raschetSkidki(sumaPokupki,skidka);
        raschetNaloga = pokupatel.raschetNaloga(sumaPokupki,nalog);
        okruglenaySuma = Rounder.rounding(sumaPokupki);
        okruglenaySkidka = Rounder.rounding(raschetSkidki);
        okruglenuiqNalog = Rounder.rounding(raschetNaloga);
    }

    static void vuvod(){
        System.out.println("Имя покупателя: " + imya + "\nСумма покупки: " + okruglenaySuma + " грн.\nСумма скидки: " +
                okruglenaySkidka + " грн.\nСумма налога: " + okruglenuiqNalog + " грн.");
    }

    static double raschetPokupki (int kol, double tzena){
        return kol * tzena;
    }
}
