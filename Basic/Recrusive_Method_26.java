public class Recrusive_Method_26 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecrusive(5));

        loop(10);

    }

    // Factorial loop
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // Factorial Recrusive
    static int factorialRecrusive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecrusive(value - 1);

        }
    }

    // Error StackOverflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
