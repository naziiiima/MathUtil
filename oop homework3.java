public class MathUtil {

    // Static Methods

    /**
     * Checks if a number is prime.
     * @param n The number to check.
     * @return true if the number is prime, otherwise false.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates the greatest common divisor (GCD) using the Euclidean algorithm.
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * Calculates the least common multiple (LCM) of two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The LCM of a and b.
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Returns the nth Fibonacci number.
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    /**
     * Calculates the factorial of a number.
     * @param n The number to compute the factorial of.
     * @return The factorial of n.
     */
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Non-static Methods

    /**
     * Determines if a number is a perfect number.
     * @param n The number to check.
     * @return true if the number is perfect, otherwise false.
     */
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    /**
     * Computes the sum of the digits of a number.
     * @param n The number to process.
     * @return The sum of the digits of n.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Reverses the digits of a number.
     * @param n The number to reverse.
     * @return The reversed number.
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    /**
     * Checks if a number is an Armstrong number.
     * @param n The number to check.
     * @return true if n is an Armstrong number, otherwise false.
     */
    public boolean isArmstrongNumber(int n) {
        int sum = 0, original = n;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    /**
     * Finds the smallest prime number greater than n.
     * @param n The number to start searching after.
     * @return The next prime number after n.
     */
    public int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Testing static methods
        System.out.println("isPrime(5): " + MathUtil.isPrime(5)); // true
        System.out.println("gcd(48, 18): " + MathUtil.gcd(48, 18)); // 6
        System.out.println("lcm(12, 15): " + MathUtil.lcm(12, 15)); // 60
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7)); // 13
        System.out.println("factorial(5): " + MathUtil.factorial(5)); // 120

        // Creating an object to test non-static methods
        MathUtil mathUtil = new MathUtil();
        System.out.println("isPerfectNumber(6): " + mathUtil.isPerfectNumber(6)); // true
        System.out.println("sumOfDigits(1234): " + mathUtil.sumOfDigits(1234)); // 10
        System.out.println("reverseNumber(1234): " + mathUtil.reverseNumber(1234)); // 4321
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153)); // true
        System.out.println("nextPrime(17): " + mathUtil.nextPrime(17)); // 19
    }
}
