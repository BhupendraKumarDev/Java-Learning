

public class Qs12 {
    public static void main(String[] args) {

        int age = 19;
        int marks = 75;

        if(age >= 18) {

            System.out.println("Age Requirement Satisfied");

            if(marks >= 60) {
                System.out.println("Admission Approved");
            }
            else {
                System.out.println("Insufficient Marks");
            }

        }
        else {
            System.out.println("Age Requirement Not Satisfied");
        }
    }
}