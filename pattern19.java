import java.util.Scanner;

public class pattern19 {
    public static void  pattern19(int n){
        int space=0;
        for(int i=0;i<n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                 for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                space+=2;
                System.out.println();
            }
            space=8;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                space-=2;
                System.out.println();

            }
    }
    

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern19(n);
        }
}
