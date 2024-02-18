import java.util.*;
public class pascal{
    public static long  ncr(int n,int r){
         long result=1;
        for(int i=0;i<r;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println("Enter the row number and column number of the element that you want to print :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        long result1=ncr(n-1,r-1);
        System.out.println(result1);
    }
}