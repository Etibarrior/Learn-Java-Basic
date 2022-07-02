package lesson08;

// пример наследования
public class SellerInfo extends Seller {

    public SellerInfo(String name, String email, String phone) {
        // доступ к переменным родительского
        // класса через super
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
