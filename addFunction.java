import java.util.Scanner;

public class addFunction {
    
    public static int additionOfTwoNumbers(int x,int y){
        int sum=(x+y);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int result=additionOfTwoNumbers(a,b);
        System.out.println(result);

    }
}
