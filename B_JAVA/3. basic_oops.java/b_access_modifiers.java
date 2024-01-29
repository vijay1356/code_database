class account {
    public String name;// can be accessed anywhere
    protected String email;// can be accessed only in this package
    private String password;// only with permission

    // getter and setters
    public String get_password() { // this is how to extract the private items
        set_password(password);
        return this.password;
    }

    private void set_password(String pass) {
        this.password = "hello";
    }
}

public class b_access_modifiers {
    public static void main(String[] args) {
        account s1 = new account();
        s1.name = "vijay";
        s1.email = "vijayavitthal1356@gmail.com";

        System.out.println(s1.get_password());

    }
}
