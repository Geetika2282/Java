import java.util.Arrays;
public class Anagram{
    public static void main(String[] args) {
        String s1 = "except";
        String s2 = "expect";

        // Convert string to char array
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();

        // Sort the char array
        Arrays.sort(chArr1);

        // Convert sorted char array back to string
        String sortedString = new String(chArr1);

        // Print the sorted string
        System.out.println("Sorted string: " + sortedString); // Output: "abcd"
    }
}
