


public class Qs7 {
    public static void main(String[] args) {

        // Count Digits

        int num = 12345;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Total digits = " + count);
    }
}
