package generics.bounded;

import java.util.List;

public class NumberUtils {
    public static <T extends Number> double doubleValue(T number){
        return number.doubleValue();
    }

    public static <T extends Number> double sum(T a, T b){
        double sum = a.doubleValue() + b.doubleValue();
        return sum ;
    }

    public static <T extends Number> double average(List<T> numbers){
        double sum = 0;
        for(T number : numbers){
            sum += number.doubleValue();
        }

        return sum/numbers.size();

    }
}
