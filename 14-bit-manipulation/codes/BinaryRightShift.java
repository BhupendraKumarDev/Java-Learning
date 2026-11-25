public class BinaryRightShift {
    public static void main(String[] args) {

        /*
            Binary Right Shift (>>)

            Logic:
            1. Shifts bits towards the right.
            2. Left side empty positions are filled
               with the sign bit (0 for positive numbers).
            3. For positive numbers, each right shift
               generally divides the number by 2.

            Example: 5 >> 1

              5 = 0101
            5>>1 = 0010

            Output = 2
        */

        System.out.println(5 >> 1);
    }
}