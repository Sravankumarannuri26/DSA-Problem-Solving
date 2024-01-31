import java.util.*;

public class AdultOrNot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int age;
        System.out.println("enter your age:");
        age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }

    }
}