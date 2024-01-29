import java.util.*;

class Sorting {
  public static void printArray(int arr[], int l) {
    System.out.print("{");
    for (int i = 0; i < l; i++) {
      System.out.print(arr[i]);
      if (i == (l - 1)) {
        System.out.println("}");
      } else
        System.out.print(",");
    }
    ;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // adding values to the array
    System.out.print("Enter the number vales to be sorted : ");
    int l = sc.nextInt();
    System.out.println("Enter the vales to be sorted 1 by 1 ");
    int arr[] = new int[l];
    for (int i = 0; i < l; i++) {
      System.out.print("Enter the " + "number" + (i + 1) + " : ");
      arr[i] = sc.nextInt();
      System.out.println();
    }
    // displaying the array
    System.out.print("{");
    for (int i = 0; i < l; i++) {
      System.out.print(arr[i]);
      if (i == (l - 1)) {
        System.out.println("}");
      } else
        System.out.print(",");
    }
    ;// {7, 8, 1, 3, 2}

    // selection sort
    for (int i = 0; i < l - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < l; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      // swap
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;

    }

    printArray(arr, l);
    sc.close();
  }
}
