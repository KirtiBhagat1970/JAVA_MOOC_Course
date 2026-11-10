package Fundamentals;
import java.util.Scanner;
public class User_input1 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int age= scanner.nextInt();
        System.out.println("age:"+age);
        scanner.close();
    }
}
