public class first {
    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        if (age >= 18) {

            System.out.println("Age requirement satisfied.");

            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a driving license.");
            }

        } else {
            System.out.println("You are underage.");
        }
    }
}
