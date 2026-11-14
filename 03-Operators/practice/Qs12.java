package practice;

public class Qs12 {

    public static void main(String[] args) {

        int age = 21;
        int marks = 75;
        boolean hasCertificate = true;

        boolean eligible = age >= 18 && marks >= 60 && hasCertificate;

        System.out.println("Student Eligible: " + eligible);

    }
}