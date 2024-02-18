import java.util.Scanner;

public class pascal1 {
    public static long ncr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            long result = 1;
            for (int i = 0; i < r; i++) {
                result = result * (n - i);
                result = result / (i + 1);
            }
            return result;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the row number for Pascal's Triangle:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            System.out.print(ncr(n-1, r-1) + " ");
        }
    }
}

