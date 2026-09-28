package generics.wildcards;

import java.util.List;
import java.util.ArrayList;

public class CollectionUtils {
    public static <T> void copy(
        List<? extends T> source,
        List<? super T> destination //PECS - PRODUCER EXTENDS, CONSUMER SUPER
    ){
        for(T item : source){   //Producer
            destination.add(item); //Consumer
        }
    }

    public static void main(String[] args){
        List<Integer> source = List.of(10, 20, 30);
        List<Number> destination = new ArrayList<>();

        CollectionUtils.copy(source, destination);
        System.out.println(destination);

        List<Double> src = List.of(1.5, 2.5, 3.5);

        List<Number> dest = new ArrayList<>();

        CollectionUtils.copy(src, dest);
        System.out.println(dest);


    }
}

