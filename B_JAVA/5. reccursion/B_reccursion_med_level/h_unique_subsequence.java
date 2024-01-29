package L_reccursion.B_reccursion_med_level;

import java.util.HashSet;

//EDIT
public class h_unique_subsequence {// add input from user
    public static void subsequence(String s, int idx, String res, HashSet<String> allsequs) {
        if (idx == s.length()) {
            if (allsequs.contains(res)) {
                return;
            }

            allsequs.add(res);
            System.out.println(res);
            return;
        }
        // choose
        subsequence(s, idx + 1, res + s.charAt(idx), allsequs);
        // not choose
        subsequence(s, idx + 1, res, allsequs);
    }

    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> allsequs = new HashSet<>();
        subsequence(s, 0, "", allsequs);

    }
}
