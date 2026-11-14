package practice;
import java.util.*;
public class Qs1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        //-------------------------------

        int sum = num1+num2;
        System.out.println("Addition = "+sum);
        int subtraction = num1-num2;
        System.out.println("subtraction: "+subtraction);
        int multiplication = num1*num2;
        System.out.println("multiplication: "+multiplication);
        int division = num1/num2;
        System.out.println("division: "+division);
        int modulus = num1%num2;
        System.out.println("modulus: "+modulus);
    }
}
