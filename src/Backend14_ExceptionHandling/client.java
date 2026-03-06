package Backend14_ExceptionHandling;

import java.util.Scanner;

import static Backend12_Generics.Client.doSomething;

public class client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();


        System.out.println(a/b);

        System.out.println("After exception");

        try{
            System.out.println("Before calling the method");
            doSomething();
            System.out.println("After calling the method");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }


    }
}
