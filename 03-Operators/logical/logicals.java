package logical;

public class logicals {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        // Logical AND (&&)
        System.out.println("AND Operator: " + (age >= 18 && hasLicense));

        // Logical OR (||)
        System.out.println("OR Operator: " + (age >= 18 || hasLicense));

        // Logical NOT (!)
        System.out.println("NOT Operator: " + (!hasLicense));

        // Another Example
        int a = 10;
        int b = 20;

        System.out.println("AND: " + (a > 5 && b > 15));
        System.out.println("OR: " + (a > 15 || b > 15));
        System.out.println("NOT: " + !(a > b));
    }
}