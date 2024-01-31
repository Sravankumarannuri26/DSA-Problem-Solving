import java.util.Scanner;

public class pattern15 {
    public static void  pattern15 (int n){
       
        for(int i=0;i<n;i++){
                for(char ch='A';ch<='A'+(n-i-1);ch++){
                    System.out.print(ch+" ");
                    
                }
                System.out.println();
            }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern15(n);
        }
}
