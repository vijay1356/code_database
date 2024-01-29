package L_reccursion.C_adv_reccursion;

import java.util.ArrayList;

public class e_subset_of_natural_numbers {// EDIT
    public static void prnt(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsub(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            prnt(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findsub(n - 1, subset);

        // add nahi goga
        subset.remove(subset.size() - 1);
        findsub(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsub(n, subset);
    }
}
