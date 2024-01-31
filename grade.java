import java.util.Scanner;

import java.util.*;
public class grade {
    public static void main(String args[]){
        System.out.println("Enter your marks:");
        Scanner sc=new Scanner(System.in);
        int marks;
        marks=sc.nextInt();
        if(marks<25){
            System.out.println("F");
        }
        else if(marks<=35){
            System.out.println("E");
        }
        else if(marks<=45){
            System.out.println("D");
        }
        else if(marks<=55){
            System.out.println("C");
        }
        else if(marks<=65){
            System.out.println("B");
        }

    }
}
