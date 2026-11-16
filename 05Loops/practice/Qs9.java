
public class Qs9 {
    public static void main(String[] args) {

        // Sum of Even Numbers

        int num = 1;
        int sum = 0;

        do {
            if (num % 2 == 0) {
                sum += num;
            }

            num++;

        } while (num <= 50);

        System.out.println("Sum of Even Numbers = " + sum);
    }
}
