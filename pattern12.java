import java.util.Scanner;

public class pattern12 {
    public static void  pattern12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                 for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
                space=space-2;
            }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern12(n);
        }
    
}
