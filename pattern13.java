import java.util.Scanner;

public class pattern13 {
      public static void  pattern13 (int n){
        int num=1;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num+=1;
                }
                System.out.println();
            }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern13(n);
        }
}
