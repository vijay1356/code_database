package L_reccursion.C_adv_reccursion;

//Place Tiles of size lxm in a floor of size nxm.
public class c_Tiling_problem {// EDIT
    public static int tile(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically palce
        int vertical = tile(n - m, m);
        // horizontal place
        int horizontal = tile(n - 1, m);
        return vertical + horizontal;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(tile(n, m));
    }
}
