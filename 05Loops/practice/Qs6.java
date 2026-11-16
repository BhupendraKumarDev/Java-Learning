
public class Qs6 {
    public static void main(String[] args) {

        // Factorial of a Number

        int num = 5;
        int factorial = 1;

        while (num >= 1) {
            factorial = factorial * num;
            num--;
        }

        System.out.println("Factorial = " + factorial);
    }
}
