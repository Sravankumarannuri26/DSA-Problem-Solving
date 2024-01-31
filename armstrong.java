import java.util.Scanner;

public class armstrong {
    public static int noOfDigits(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        return sum;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubmber:");
        int num=sc.nextInt();
        int dup=num;
        int sum1=noOfDigits(num);
        if(sum1==dup){
        System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        
    }
}
