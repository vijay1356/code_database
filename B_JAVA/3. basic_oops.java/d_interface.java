interface animal {
    void walk();// by default it is public and static and u cannot change
    // animal() //Interfaces cannot have constructors
}

class horse implements animal {
    public void walk() {
        System.out.println("it walks in 4 legs");
    }
}

public class d_interface {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();

    };
}
