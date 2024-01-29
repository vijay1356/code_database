
import java.util.Scanner;

public class bubble_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // adding values to the array
    System.out.print("Enter the number vales to be sorted : ");
    int l = sc.nextInt();
    System.out.println("Enter the vales to be sorted 1 by 1 ");
    int ar[] = new int[l];
    for (int i = 0; i < l; i++) {
      System.out.print("Enter the " + "number" + (i + 1) + " : ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    // displaying the array
    System.out.print("{");
    for (int i = 0; i < l; i++) {
      System.out.print(ar[i]);
      if (i == (l - 1)) {
        System.out.println("}");
      } else
        System.out.print(",");
    }
    ;

    // bubble sort
    for (int i = 0; i < l - 1; i++) {
      for (int j = 0; j < l - i - 1; j++) {
        if (ar[j] > ar[j + 1]) {
          int temp = ar[j];
          ar[j] = ar[j + 1];
          ar[j + 1] = temp;
        }
      }

    }
    // displaying the array
    System.out.print("{");
    for (int i = 0; i < l; i++) {
      System.out.print(ar[i]);
      if (i == (l - 1)) {
        System.out.println("}");
      } else
        System.out.print(",");
    }
    ;
    sc.close();
  }
}
