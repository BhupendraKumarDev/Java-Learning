
public class Qs13{
    public static void main(String[] args) {

        // Skip Multiples of 3

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
