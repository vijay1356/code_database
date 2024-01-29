package L_reccursion.C_adv_reccursion;

public class b_maze {// EDIT
    public static int maze(int i, int j, int n, int m) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        // move down
        int downpaths = maze(i + 1, j, n, m);
        // move right
        int rightpaths = maze(i, j + 1, n, m);
        return downpaths + rightpaths;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(maze(0, 0, n, m));
    }
}
