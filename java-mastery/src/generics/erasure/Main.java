package generics.erasure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //COMPILE-TIME TYPE SAFETY
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        System.out.println(names.getClass());
        System.out.println(numbers.getClass());

        System.out.println(
            names.getClass() == numbers.getClass()
        );
    }
}
