public class str1 {
    public static void main(String[] args) {
        // Declare and initialize two string variables with the same value
        String s = "Java";
        String s1 = "Java";

        // Compare the references of s and s1 using '=='
        // This checks if both variables point to the same object in memory
        if (s == s1) {
            System.out.println("Equal"); // This will print because s and s1 point to the same interned string
        }

        // Compare the content of the strings using 'equals()'
        // This checks if the values of s and s1 are the same
        if (s.equals(s1)) {
            System.out.println("Equals: true"); // This will also print because both strings have the same content
        }

        // Create two new String objects with the same content
        String a = new String("Java");
        String b = new String("Java");

        // Concatenate string a with b using concat() method
        System.out.println("a.concat(b): " + a.concat(b)); // Outputs "JavaJava"

        // Concatenate string a with b using the + operator
        System.out.println("a+b: " + a + b); // Outputs "JavaJava"

        // Calculate the hash codes of a and b
        int n1 = a.hashCode(); // This generates a hash code for the content of string a
        int n2 = b.hashCode(); // This generates a hash code for the content of string b

        // Print the hash codes
        System.out.println("n1: " + n1); // Outputs the hash code of a
        System.out.println("n2: " + n2); // Outputs the hash code of b

        // Compare the hash codes of a and b
        System.out.println(n1 == n2); // This will print true because both strings have the same content

        // Compare the content of a and b using 'equals()'
        System.out.println(a.equals(b)); // This will print true because both strings have the same content

        // It must be  assigned to a variable or printed with SysOut
        a.concat("Hello");
        System.out.println(a.concat(" world"));

        String hw = "Hello world";
        String hw2 = "hello world";
        System.out.println(hw.charAt(1));
        System.out.println(hw.compareTo(hw2)); // compares the difference between the 1st dissimilar char it finds
        System.out.println(hw.compareToIgnoreCase(hw2));
    }
}
