package L_reccursion.C_adv_reccursion;

public class d_call_guest {// EDIT
    public static int guest(int n) {
        if (n <= 1) {
            return 1;
        }
        int single = guest(n - 1);
        int pair = (n - 1) * guest(n - 2);
        return single + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(guest(n));
    }
}
