public class BinaryOnesComplement {
    public static void main(String[] args) {

        /*
            Binary NOT (~) / 1's Complement

            Rules:

            ~0 = 1
            ~1 = 0

            It reverses all bits (0 to 1, 1 to 0).

            Example: ~5

            5  = 00000000 00000000 00000000 00000101
            ~5 = 11111111 11111111 11111111 11111010

            Output = -6

            Note: Java uses 32-bit signed int
            and 2's complement representation.
        */

        System.out.println(~5);
    }
}