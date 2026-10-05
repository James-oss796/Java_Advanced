package streams;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
import java.util.String;


public class JavaStreams {
    public static void main(String[] args){
        //1. Integer streams
        IntStream
            .range(1, 10)
            .forEach(System.out::print);

        System.out.println();

        //2. Integer stream with skip
        IntStream
            .range(1, 10)
            .skip(5)
            .forEach(x->System.out.println(x));
        System.out.println();

        //3. INteger stream with sum
        
        System.out.println(
            IntStream
            .range(1, 5)
            .sum()
        );

        System.out.println();

        //4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println();

        //5. Stream from array , sort, filter and print
        String[] names = {"Al" , "Ankit", "Kushkal" , "Brent", "Sarika", "Amanda", "Hans", "Shivika"};
        Arrays.stream(names)
            .filter(x->x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);

        System.out.println();

        //6. Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
            .map(x -> x*x)
            .average()
            .ifPresent(System.out::println);

        System.out.println();

        //7. Stream from list, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "Amanda");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);
        Systm.out.println();

    }
}
