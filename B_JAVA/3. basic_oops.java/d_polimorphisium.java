class student {
    String name;
    int age;

    // this is called polymorphism
    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {// EDIT
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class d_polimorphisium {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "aman";
        s1.age = 24;
        s1.printinfo(s1.age);
    }
}
