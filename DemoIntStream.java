import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
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

            stream = Arrays.stream(nums);
            OptionalInt min = stream.min();
            if(min.isPresent())
                System.out.println(min.getAsInt());

            stream = Arrays.stream(nums);
            OptionalInt max = stream.max();
            if(max.isPresent())
                System.out.println(max.getAsInt());

            stream = Arrays.stream(nums);
            OptionalDouble ave = stream.average();
            if(ave.isPresent())
                System.out.println(ave.getAsDouble());

            stream = Arrays.stream(nums);
            OptionalInt total = stream.reduce((n1, n2)-> n1 * n2);
            if(total.isPresent())
                System.out.println(total.getAsInt());

            stream = Arrays.stream(nums);
            long totalVal = stream.reduce(1, (n1, n2) -> n1*n2);
            System.out.println(totalVal);
    }
}
