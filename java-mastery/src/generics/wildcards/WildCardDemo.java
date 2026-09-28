package generics.wildcards;
import java.util.List;

public class WildCardDemo {
    public static void printNumbers(List<? extends Number> numbers){
        for(Number number : numbers){
            System.out.println(numbers);
        }
    }

    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        
        for(Number num : numbers){
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void addIntegers(List<? super Integer> numbers){
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static <T> void copy(List<? extends T> source, List<? super T> destination){
        for(T item : source){
            destination.add(item);
        }
    }
}
