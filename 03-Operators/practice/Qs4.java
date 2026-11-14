package practice;

public class Qs4 {
    public static void main(String[] args){
        int age = 22;
        boolean hasID = true;

        boolean eligible = age >= 18 && hasID;

        System.out.println("Eligible: " + eligible);
    }
}
