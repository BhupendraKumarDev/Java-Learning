public class Qs11 {
    public static void main(String[] args) {

        String username = "admin";
        String password = "12345";

        if(username.equals("admin")) {

            System.out.println("Username Verified");

            if(password.equals("12345")) {
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Incorrect Password");
            }

        }
        else {
            System.out.println("Invalid Username");
        }
    }
}