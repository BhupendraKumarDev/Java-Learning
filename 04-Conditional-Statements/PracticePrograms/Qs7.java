public class Qs7 {
    public static void main(String[] args) {

        int a = 25;
        int b = 50;
        int c = 350;

        if(a > b && a > c) {
            System.out.println("a is greater: " + a);
        } 
        else if(b > a && b > c) {
            System.out.println("b is greater: " + b);
        } 
        else if(c > a && c > b) {
            System.out.println("c is greater: " + c);
        } 
        else {
            System.out.println("Some numbers are equal");
        }
    }
}