import java.util.Scanner;

public class palindrome {
   public static int noOfDigits(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        return rev;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubmber:");
        int num=sc.nextInt();
        int duplicate=num;
        int rev1=noOfDigits(num);
        System.out.println(rev1);
        if(rev1==duplicate){
            System.out.println("given number is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    } 
}
