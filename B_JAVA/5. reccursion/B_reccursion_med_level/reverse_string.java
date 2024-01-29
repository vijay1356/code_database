package L_reccursion.B_reccursion_med_level;

import java.util.Scanner;

public class reverse_string {
    public static void rev(int n, String s) {
        if (n == 0) {
            System.out.println(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        rev(n - 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to be reversed ");
        String s = sc.next();
        System.out.println("input word    : " + s);
        System.out.print("reversed word : ");
        rev(s.length() - 1, s);
        sc.close();
    }
}
