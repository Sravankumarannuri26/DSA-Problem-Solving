import java.util.Scanner;

public class gcdEucludien{
    public static void noOfDigits(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2) {
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            } 
        }
        if(n1==0){
            System.out.println(n2);
        }
        else{
            System.out.println(n1);
        }
        
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        noOfDigits(num1,num2);
        
        
        
    }
}
