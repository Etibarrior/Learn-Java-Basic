package task11;

/*
  @author Kirill Maryukhna
 */

public class Client {

    private static String name;
    private static String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }
}
