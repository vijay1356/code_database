package L_reccursion.C_adv_reccursion;

public class a_permutation {// EDIT
    public static void permutation(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            String newstring = s.substring(0, i) + s.substring(i + 1);
            permutation(newstring, res + currchar);
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}