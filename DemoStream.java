import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

/* Collections like List allow us to store and manage dynamic sets of data.
   We can iterate over them using loops like `for-each` or `for` loops.
   Additionally, Java Streams can be used to process data by applying operations like map, filter, and reduce.
*/

public class DemoStream {
    public static void main(String[] args) {
        /*Normal array is a fixed-size structure that can store primitive types (like int), but it lacks many of the higher-level functionalities provided by the List interface, such as methods for easy iteration, adding/removing elements, and stream processing.*/
        List<Integer> nums = Arrays.asList(4, 8, 7, 2, 3, 4, 1, 2);
        nums.forEach(n-> System.out.print(n));

//        parallel stream -> huge amount of data using multiple threads
        Stream<Integer> data = nums.stream();
        data.forEach(n-> System.out.println(n));
        /* Below line will generate an exception because you can't reuse stream
        data.forEach(n-> System.out.println(n));*/
        Stream<Integer> data2 = nums.stream();
        System.out.println(data2.distinct());

        System.out.println();
        Stream<Integer> data3 = nums.stream();
        long count = (data3.count());
        System.out.println(count);

        Stream<Integer> data4 = nums.stream();
        System.out.println();
        Stream<Integer> sData = data4.sorted();
        sData.forEach(n-> System.out.print(n+" "));
//        System.out.println(sData);

        System.out.println("\nAll in one(creating stream, mapping, foreach) \nOriginal: ");

        // Create a stream from the list of numbers
                Stream<Integer> data5 = nums.stream();

        // We don't need to create a stream variable like `data5`.
        // Instead, we can chain methods directly in one line.
        // Here, we create a stream and immediately use forEach to print each number.
                nums.stream()
                        .forEach(n -> System.out.println(n));  // Print each element in the stream on a new line

                System.out.println("-------------------\nMapped: ");

        // Here we create another stream, apply the `map()` function to double each number (n * 2),
        // and then use forEach again to print each doubled number on a new line.
                nums.stream()
                        .map(n -> n * 2)  // Multiply each element by 2
                        .forEach(n -> System.out.println(n + " "));  // Print the doubled element

        /*
        In the above lines, a new stream is created each time we chain a method (like `.stream()`, `.map()`, or `.forEach()`).
        It’s important to understand that each time you apply a method like `.map()` or `.forEach()`, the previous stream is replaced by the new one.
        We don’t need to worry about memory usage here because streams in Java are designed to be lightweight and not duplicated in memory.
        */

        // Example of breaking it down into separate steps (for better understanding):
        // Create a new stream `mapData` that doubles the elements from the `data5` stream
        // Stream<Integer> mapData = data5.map(n -> n * 2);

        // Then, print each doubled element using `forEach`
        // mapData.forEach(n -> System.out.print(n + " "));
        System.out.println("------");
        nums.stream()
                .sorted() // sorts in ascending order
                .forEach(n-> System.out.println(n));

        System.out.println("-----Multiply only odd numbers by 10");
        nums.stream()
                .filter(n->n%2!=0)
                .sorted()
                .map(n->n*10)
                .forEach(n-> System.out.println(n));

//        Predicate - functional interface that has a method test (using this instead of lambda expression)
        System.out.println("Printing even numbers: ");
        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
//            overriding the test method, it'll return true for even numbers
            public boolean test(Integer n) {
                return n%2==0;
            }
        };

        /*Above predicate can be reduced as:
        Predicate<Integer> predi = n-> n%2==0 */
        nums.stream().filter(predi).forEach(n-> System.out.println(n));

        nums.stream().map(n->n*100).forEach(n-> System.out.println(n));

        System.out.println("-----------Reduce");
        /* nums.stream(): This creates a stream from the list nums. The stream is a sequence of elements (here, the numbers 4, 8, 7, 2, 3, 4, 1, 2) that we can process.

    .reduce(0, (c, e) -> c + e): This is where we sum up all the numbers in the list. Let's break it down:

    reduce: The reduce method combines all the elements in the stream into a single result, in this case, by summing them.
    0: This is the initial value of the sum. So, we start with 0 and add each element to it.
    (c, e) -> c + e: This is a lambda function (a short way to write a small function). It works like this:
    c: This represents the "current total" (starting at 0).
    e: This represents the "element" in the list we are currently processing.
    c + e: This adds the current element (e) to the current total (c)*/
        
        int result = nums.stream().reduce(0, (c, e)-> c+e);
        System.out.println(result);
    }
}
