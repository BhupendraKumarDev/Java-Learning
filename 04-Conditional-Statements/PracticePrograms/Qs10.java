public class Qs10 {
    public static void main(String[] args) {

        int age = 22;
        boolean hasVoterID = true;

        if(age >= 18) {

            System.out.println("Age Requirement Satisfied");

            if(hasVoterID == true) {
                System.out.println("Voter ID Available");
                System.out.println("You Can Vote");
            }
            else {
                System.out.println("Voter ID Required");
            }

        }
        else {
            System.out.println("Not Eligible to Vote");
        }
    }
}