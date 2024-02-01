//input the word from the user 
// try to put the vaules beside each other and put comma between 
// try to arrage them in size order one below other 
public class g_subsequencs {// EDIT
    public static void subsequences(String s, int idx, String res) {
        if (idx == s.length()) {
            System.out.println(res);
            return;
        }
        // to do
        subsequences(s, idx + 1, res + s.charAt(idx));
        // not to do
        subsequences(s, idx + 1, res);
    }

    public static void main(String[] args) {
        String s = "abcd";
        subsequences(s, 0, "");
    }
}
