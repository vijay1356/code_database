import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.println("welocome type your choice from below");
            System.out.println();
            System.out.println("getbit --> To get the number from the pos you want in the given number's binary form");
            System.out.println("setbit --> To set the number to the pos you want in the given number's binary form");
            System.out.println(
                    "clearbit --> To clear the number from the pos you want in the given number's binary form");
            System.out
                    .println("toogle --> To toogle the number from the pos you want in the given number's binary form");
            System.out.println("count --> To count the number  of 1's in a binary representation of the number.");
            System.out.println();
            System.out.print("Which function u want to do :");
            String input = (sc.next());
            if (input.equals("getbit")) {
                System.out.print("Enter the number to get the bit : ");
                int num = sc.nextInt();
                System.out.println("the binary form of the given number is : " + Integer.toBinaryString(num));
                System.out.print("position to get the bit : ");
                int pos = sc.nextInt();
                pos--;
                int bitmask = 1 << pos;
                if ((bitmask & num) == 0)
                    System.out.println("the bit present at " + (pos + 1) + " is zero");
                else
                    System.out.println("the bit present at position " + (pos + 1) + " is one");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println();
            } else if (input.equals("setbit")) {
                System.out.print("Enter the number to set the bit : ");
                int num = sc.nextInt();// 0101
                System.out.println("the binary form of the given number is : " + Integer.toBinaryString(num));
                System.out.print("position to set the bit : ");
                int pos = sc.nextInt();// 2
                pos--;
                int bitmask = 1 << pos;
                int set = bitmask | num;
                System.out.println("number after set is " + (set));
                System.out.println("the binary form of the set number : " + Integer.toBinaryString(set));
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println();

            } else if (input.equals("clearbit")) {
                System.out.print("Enter the number to clear the bit : ");
                int num = sc.nextInt();// 0101
                System.out.println("the binary form of the given number is : " + Integer.toBinaryString(num));
                System.out.print("position to clear the bit : ");
                int pos = sc.nextInt();// 2
                pos--;
                int bitmask = 1 << pos;
                int notbitmask = ~bitmask;
                int res = notbitmask & num;
                System.out.println("number after clear is " + (res));
                System.out.println("the binary form of the cleared number : " + Integer.toBinaryString(res));
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println();
            } else if (input.equals("toogle")) {
                System.out.print("Enter the number to toogle the bit : ");
                int num = sc.nextInt();// 0101
                System.out.println("the binary form of the given number is : " + Integer.toBinaryString(num));
                System.out.print("position to toogle the bit : ");
                int pos = sc.nextInt();// 2
                pos--;
                int bitmask = 1 << pos;
                int set = bitmask ^ num;
                System.out.println("number after toogleing is " + (set));
                System.out.println("the binary form of the toogled number : " + Integer.toBinaryString(set));
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println();

            } else if (input.equals("count")) {
                System.out.print(
                        "Enter the number to count the number of 1's in a binary representation of the number : ");
                int num = sc.nextInt();
                String bi = Integer.toBinaryString(num);
                System.out.println("the binary form of " + num + " is " + bi);
                int length = bi.length();
                int res = 0;
                for (int i = 0; i < length; i++) {
                    if (bi.charAt(i) == '1')
                        res++;
                }
                System.out.println("number  of 1's in a binary representation of " + num + " is " + res);
            } else
                System.out.println("invalid input");

            System.out.print("if you want to continue type 'yes' : ");
            ch = (sc.next());
        } while (ch.equals("yes"));
        System.out.println("........................................");
        System.out.println("THANKYOU");
        sc.close();
    }
}
