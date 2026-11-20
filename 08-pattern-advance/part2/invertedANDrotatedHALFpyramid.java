public class invertedANDrotatedHALFpyramid {

    public static void inverted_rotated_half_pyramid(int n) {

        // Outer loop: Rows control karega
        for (int i = 1; i <= n; i++) {

            // Inner loop: Spaces print karega
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop: Stars print karega
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        inverted_rotated_half_pyramid(5);

    }
}