import java.util.Scanner;

public class b_first_and_last {
    public static int f = -1;
    public static int l = -1;
    public static int o = 1;

    public static void ff(int n, String s, char ch) {
        if (n == s.length()) {
            return;
        }
        if (ch == s.charAt(n)) {
            if (f == -1) {
                f = n;
            } else {
                l = n;
            }
        }
        ff(n + 1, s, ch);

    }

    public static void prin(int n) {
        if (o == n) {
            System.out.print(o);
            return;
        }
        System.out.print(o);
        o++;
        prin(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to find the first and last index of given repated letter : ");
        String s = sc.next();
        System.out.print("Enter the letter to find te first and last index ");
        char ch = sc.next().charAt(0);
        ff(0, s, ch);
        System.out.println("word input is : " + s);
        System.out.print("                ");
        prin(s.length());
        System.out.println();
        System.out.println("first " + ch + " is at " + (f + 1));
        System.out.println("last " + ch + " is at " + (l + 1));
        sc.close();
    }
}
