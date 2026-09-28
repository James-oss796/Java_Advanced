package generics.methods;
import java.util.List;

public class GenericMethods {
    public static <T> T last(List<T> items){
        return items.get(items.size()-1);
    }

    public static <T> T first(List<T> items){
        return items.get(0);
    }

    public static <T> void printAll(List<T> items){
        for(T item : items){
            System.out.println(item);
        }
    }

    public static <T> boolean contains(List<T> items, T target){
        for(T item : items){
            if(item.equals(target)){
                return true;
            }
        }
        return false;
    }
}
