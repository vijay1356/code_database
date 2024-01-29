package L_reccursion.B_reccursion_med_level;

public class i_keypad {// EDIT
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void comb(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.println(res);
            return;
        }
        int curchar = number.charAt(idx);
        String mapping = keypad[curchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            comb(number, idx + 1, res + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String number = "23";
        comb(number, 0, "");
    }
}
