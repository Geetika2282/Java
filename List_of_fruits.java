import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;


public class List_of_fruits {

    public static void main(String[] args) {
//        List_of_fruits lf = new List_of_fruits();

        String [] fruits = {"Mango","Orange","Grapes","Apple","Banana","Strawberry","Watermelon"};
        List<String> lst = Arrays.asList(fruits);

        System.out.println("-----------------------------");
//        Uppercase
        Stream<String> stream = lst.stream();
        stream.map(s -> s.toUpperCase()).forEach(System.out::println);

        System.out.println("-----------------------------");
//        Lowercase
        Stream<String> lstream = lst.stream();
        lstream.map(s -> s.toLowerCase()).forEach(System.out::println);

//  ascending order fruits less than 'n'

        System.out.println("-----------------------------");
        int val = 'n';
        Stream<String> stream3 = lst.stream();
        stream3.filter((str)-> (int)str.toLowerCase().charAt(0)<val).forEach(System.out::println);

        System.out.println("-----------------------------");
        int val1 = 'n';
        Stream<String> stream4 = lst.stream();
        stream4.filter((str)-> (int)str.toLowerCase().charAt(0)>val1).forEach(System.out::println);

        System.out.println("-----------------------------");
        Stream<String> stream5 = lst.stream();
        stream5.filter((str)->str.length()<=6 ).forEach(System.out::println);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
    }
}
