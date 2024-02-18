import java.util.Scanner;

public class pacal11 {
    public static void ncr(int n) {
        int ans = 1;
        System.out.print(ans + " ");

        for (int i = 1; i < n; i++) {
            ans = ans * (n - i) ;
            ans=ans/i;
            System.out.print(ans + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the row number for Pascal's Triangle:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ncr(n);
    }
}

