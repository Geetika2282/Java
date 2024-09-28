import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        // Create a List to hold various data types
        List<Object> lst = new ArrayList<>();

        // Add different types of elements to the list
        lst.add(120);       // Integer
        lst.add("Hi");     // String
        lst.add(23.4f);    // Float
        lst.add(true);     // Boolean

        // Print all elements in the list using a traditional for loop
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        // Remove the string "Hi" from the list
        lst.remove("Hi");

        // Print remaining elements using an enhanced for loop (for-each)
        for (Object o : lst) {
            System.out.println(o);
        }

        // Create an Iterator to traverse the list
        Iterator<Object> it = lst.iterator();

        // Use the Iterator to print each element in the list
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // The following block would give an error if uncommented,
        // because not all elements in the list can be cast to Integer.
        // It demonstrates type safety issues with a raw List.
        /*
        for (Object o : lst) {
            int i = (Integer) o; // This will throw a ClassCastException
            System.out.println(i++);
        }
        */
    }
}
