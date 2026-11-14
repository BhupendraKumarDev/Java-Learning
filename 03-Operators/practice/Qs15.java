package practice;

public class Qs15 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        boolean smallest = a < b && a < c;

        boolean greater = c > b;

        boolean positive = a > 0 && b > 0;

        boolean equal = a == b && b == c;

        System.out.println("a is smallest: " + smallest);
        System.out.println("c is greater than b: " + greater);
        System.out.println("Both a and b are positive: " + positive);
        System.out.println("All numbers are equal: " + equal);

    }
}