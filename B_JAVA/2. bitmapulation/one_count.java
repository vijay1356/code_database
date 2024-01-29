import java.util.Scanner;

public class one_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to count the number of 1’s in a binary representation of the
        // number.
        System.out.print("Enter the number to count the number of 1's in a binary representation of the number : ");
        int num = sc.nextInt();
        String bi = Integer.toBinaryString(num);
        System.out.println("the binary form of " + num + " is " + bi);
        int length = bi.length();
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (bi.charAt(i) == '1')
                res++;
        }
        System.out.println(res);

        sc.close();
    }
}
