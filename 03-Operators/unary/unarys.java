package unary;

public class unarys {

    public static void main(String[] args) {

        int a = 10;

        // Unary Plus (+)
        System.out.println("Unary Plus: " + (+a));

        // Unary Minus (-)
        System.out.println("Unary Minus: " + (-a));

        // Pre-Increment (++a)
        System.out.println("Pre-Increment: " + (++a));

        // Post-Increment (a++)
        System.out.println("Post-Increment: " + (a++));

        // Value after Post-Increment
        System.out.println("After Post-Increment: " + a);

        // Pre-Decrement (--a)
        System.out.println("Pre-Decrement: " + (--a));

        // Post-Decrement (a--)
        System.out.println("Post-Decrement: " + (a--));

        // Value after Post-Decrement
        System.out.println("After Post-Decrement: " + a);

        // Logical NOT (!)
        boolean isJavaEasy = true;
        System.out.println("Logical NOT: " + (!isJavaEasy));
    }
}