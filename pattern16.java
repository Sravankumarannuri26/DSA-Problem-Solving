
import java.util.Scanner;

public class pattern16 {
    public static void  pattern16 (int n){
       
        for(int i=0;i<n;i++){
            char ch='A'+i;
                for(int j=1;j<=i;j++){
                    System.out.print(ch+" ");
                    
                }
                System.out.println();
            }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern16(n);
        }
}
