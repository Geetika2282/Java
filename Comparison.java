public class Comparison {
    public static void main(String[] args) {

        // Creating two string literals s1 and s2. String literals are stored in the String pool.
        String s1 = "Geet";
        String s2 = "Geet";

        // The `equals` method compares the content of the strings.
        // Since s1 and s2 have the same content "Geet", this will print true.
        System.out.println(s1.equals(s2));

        // The `==` operator checks if both references point to the same object in memory.
        System.out.println(s1 == s2);

        // Creating two strings w1 and w2 using the `new` keyword.
        // This creates two different String objects in the heap memory, not in the String pool.        String w1 = new String("Yasha");
        String w2 = new String("Yasha");

        // The `equals` method compares the content of the strings.
        // Even though w1 and w2 are different objects in memory, they have the same content "Yasha",
        System.out.println(w1.equals(w2));

        // Checks if both references point to the same object
        System.out.println(w1 == w2);
    }
}
