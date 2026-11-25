public class BinaryLeftShift {
    public static void main(String[] args) {

        /*
            Binary Left Shift (<<)

            Logic:
            1. Shifts bits towards the left.
            2. Right side empty positions are filled with 0.
            3. For positive numbers, each left shift
               generally multiplies the number by 2.

            Example: 5 << 1

              5 = 0101
            5<<1 = 1010

            Output = 10
        */

        System.out.println(5 << 1);
    }
}