abstract class animal {
    abstract void walk();

    animal() {
        System.out.println("animal class is called");
    }
}

class horse extends animal {
    horse() {
        System.out.println("horse method is called");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animal {
    chicken() {
        System.out.println("chicken called");
    }

    public void walk() {
        System.out.println("walks on 2 legs");

    }
}

public class c_abstracters {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
    }

}
