import java.util.Scanner;

public class gcd {
    public static int noOfDigits(int n,int n1){
        int gcd=1;
        for(int i=1;i<=Math.min(n,n1);i++){
            if(n%i==0 && n1%i==0){
                gcd=i;
            }

        }
        return gcd;
        
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubmber:");
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int gcd1=noOfDigits(num,num1);
        System.out.println(gcd1);
        
        
    }
}
