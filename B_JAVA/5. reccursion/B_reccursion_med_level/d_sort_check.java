import java.util.Scanner;

public class d_sort_check {
    public static int sd = 0;

    public static void prn(int arr[], int size) {
        if (sd == size) {
            sd = 0;
            return;
        }
        System.out.print(arr[sd]);
        sd++;
        prn(arr, size);
    }

    public static void sch(int arr[], int size) {
        if (sd == size) {
            System.out.println("the array is sorted");
            sd = 0;
            return;
        }
        if (arr[sd] > arr[(sd + 1)]) {
            System.out.println("the array is not neatly sorted");
            return;
        }
        sd++;
        sch(arr, size);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the vaule to be added in index number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        // printing
        System.out.print("The array looks like this ");
        prn(arr, size);
        System.out.println();

        // check sorting
        sch(arr, size - 1);

        sc.close();
    }
}
