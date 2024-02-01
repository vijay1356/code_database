//Move all 'x' to the end of the string
// ex. anxbd
public class a_all_x_to_the_end {
    // static variable
    public static int sd = 0;
    public static int counter = 0;
    public static int counterr = 0;

    public static void prn(String s[], int n) {
        if (sd == n) {
            sd = 0;
            return;
        }
        System.out.print(s[sd]);
        sd++;
        prn(s, n);
    }

    public static void xx(int n, String s[]) {// abxcxd
        if (n == 0) {
            sd = 0;
            return;

        }

        if (s[sd] == "x") {
            counter++;
        } else {
            s[counterr] = s[sd];
            counterr++;
        }
        sd++;
        xx(n - 1, s);

    }

    public static void main(String[] args) {
        String s[] = { "a", "b", "x", "c", "x", "d", "x" };
        int n = s.length;
        // prnt
        System.out.print("The array looks like this ");
        prn(s, n);

        // process
        xx(n, s);
        int p = n - counter + 1;
        System.out.println();
        for (int i = p; i < n; i++) {
            s[i] = "x";
        }

        // prnt
        System.out.println();
        System.out.print("The new array looks like this ");
        prn(s, n);

    }
}
