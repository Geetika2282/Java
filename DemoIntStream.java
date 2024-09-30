import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream
{
    public static void main(String[] args) {
        int[] nums = {12, 4, 7, 5, 6, 45, 47, 57, 3, 56, 7, 45, 5, 56, 34, 56, 88, 8};
        IntStream stream = Arrays.stream(nums);
        System.out.println(stream.count());
        stream = Arrays.stream(nums);
        System.out.println(stream.distinct().sorted().count());
        stream = Arrays.stream(nums);

//        stream.distinct().sorted().forEach((n)-> System.out.println(n));
            stream.distinct().sorted().forEach(System.out::println);

            stream = Arrays.stream(nums);
            List<Integer> even = stream.map((n)->n*n).boxed().collect(Collectors.toUnmodifiableList());
            System.out.println();

    }
}
