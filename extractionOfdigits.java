import java.util.Scanner;
public class extractionOfdigits {
    public static int noOfDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubmber:");
        int num=sc.nextInt();
        int count1=noOfDigits(num);
        System.out.println(count1);
    }
}
