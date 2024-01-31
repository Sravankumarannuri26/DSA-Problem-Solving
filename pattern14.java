import java.util.Scanner;

public class pattern14 {
    public static void  pattern14 (int n){
        
        for(int i=1;i<=n;i++){
                for(char ch='A';ch<='A'+i;ch++){
                    System.out.print(ch+" ");
                    
                }
                System.out.println();
            }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern14(n);
        }
}
