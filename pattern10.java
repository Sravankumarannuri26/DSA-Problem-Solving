import java.util.Scanner;

public class pattern10 {

    public static void  pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pattern10(n);
        }
    
}
