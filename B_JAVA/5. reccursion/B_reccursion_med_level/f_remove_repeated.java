
package L_reccursion.B_reccursion_med_level;

//Remove duplicates in a string.
public class f_remove_repeated {// add scanner class and input the words//EDIT
    public static boolean arr[] = new boolean[26];

    public static void remove_repeate(int idx, String s, String newc) {
        if (idx == s.length()) {
            System.out.println(newc);
            return;
        }
        char currchar = s.charAt(idx);
        if (arr[currchar - 'a']) {
            remove_repeate(idx + 1, s, newc);
        } else {
            newc += currchar;
            arr[currchar - 'a'] = true;
            remove_repeate(idx + 1, s, newc);

        }
    }

    public static void main(String[] args) {
        String s = "abbccdd";
        remove_repeate(0, s, "");
    }
}
