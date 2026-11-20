package parameterANDarguments;

public class first {
    public class Demo {

    // Method Definition
    // a aur b ko PARAMETERS kehte hain.
    // Kyunki ye variables method ke andar values receive karte hain.

    static void add(int a, int b) {

        // a aur b mein received values ko add karenge.
        int sum = a + b;

        System.out.println("Addition = " + sum);
    }

    public static void main(String[] args) {

        // Method Calling
        // 10 aur 20 ko ARGUMENTS kehte hain.
        // Kyunki hum actual values method ko pass kar rahe hain.

        add(10, 20);
    }
}
}
