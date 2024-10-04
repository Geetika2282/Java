import java.util.List;
import java.util.*; // Importing utility classes like Arrays and List

public class mapFilterReduceSorted {
    public static void main(String[] args) {
        // Create a list of integers using Arrays.asList, which returns an immutable list.
        List<Integer> l1 = Arrays.asList(4, 5, 6, 7, 1, 8, 2, 3, 2, 3, 4);

        // Stream API is used to process collections of objects in a functional way.
        // It supports various methods like map, filter, reduce, etc.
        int result = l1.stream()        // Create a stream from the list of integers.
                .filter(n -> n % 2 == 0) // Filter even numbers. 'n % 2 == 0' checks if the number is divisible by 2 (i.e., even).
                .map(n -> n * 2)         // Multiply each filtered (even) number by 2 using the map() function.
                .reduce(0, (c, e) -> c + e); // Reduce the stream to a single value (sum in this case).
        // The initial value (identity) is 0.
        // The lambda expression (c, e) -> c + e says: "Take the current sum (c) and add the next element (e) to it."

        // Explanation of reduce:
        // c is the "current" sum (starts as 0), and e is the element to be added.
        // It keeps accumulating the sum of elements processed through filter and map.

        // As a result, 'result' will store the sum of the transformed elements.

        // Note: The stream here goes through the following steps:
        // 1. Filters only even numbers (filter)
        // 2. Doubles those even numbers (map)
        // 3. Adds up the doubled numbers and returns the sum (reduce)

        System.out.println(result); // Print the final result to the console
    }
}
