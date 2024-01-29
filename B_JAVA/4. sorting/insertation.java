import java.util.Scanner;

public class insertation {
  public static void printing(int l, int ar[]) {
    System.out.print("{");
    for (int i = 0; i < l; i++) {
      System.out.print(ar[i]);
      if (i == (l - 1)) {
        System.out.println("}");
      } else
        System.out.print(",");
    }
  }

  public static void insertsort(int l, int ar[]) {
    // insertation sorting
    for (int i = 1; i < l; i++) {
      int current = ar[i];
      int j = i - 1;
      while (j >= 0 && ar[j] > current) {
        ar[j + 1] = ar[j];
        j--;
      }
      ar[j + 1] = current;
    }
  }

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
    printing(l, ar);
    insertsort(l, ar);
    printing(l, ar);

    sc.close();
  }
}
