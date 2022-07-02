package lesson13.interfaсez.demod;


public class SellerA extends Seller{

    public SellerA(String name, String email, String phone){
        super(name, email, phone);
    }

    public void infoSeller() {
        System.out.println(
                "Продавец: " + getName() +
                "\nE-mail: " + getEmail() +
                "\nТелефон: " + getPhone()
        );
    }
}
