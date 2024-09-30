//Predicate.java
/*
//public interface Predicate {
//    boolean test(int n);
//}
 */


public class DemoLambda {
    public static void main(String[] args) {
        // Create a Predicate using a lambda expression to check if a number is even
        Predicate isEven = (n) -> n % 2 == 0;

        // Test the isEven predicate with the number 14 and print the result
        System.out.println("Is 14 even? " + isEven.test(14)); // Expected output: true

        // Create a Predicate using a lambda expression to check if a number is prime
        Predicate isPrime = (n) -> {
            // Check if the number is less than 2, which are not prime
            if (n < 2) return false;
            // Loop through numbers from 2 to n-1
            for (int i = 2; i < n; i++) {
                // If n is divisible by i, then it's not prime
                if (n % i == 0)
                    return false; // Not a prime number
            }
            // If no divisors were found, n is prime
            return true;
        };

        // Test the isPrime predicate with the number 7 and print the result
        System.out.println("Is 7 prime? " + isPrime.test(7)); // Expected output: true
    }
}

