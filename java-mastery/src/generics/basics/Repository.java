package generics.basics;
import java.util.List;
import java.util.ArrayList;

public class Repository<T> {

    private final List<T> items;

    public Repository(){
        this.items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);

    }

    public T get(int index){
        return items.get(index);
    }

    public void remove(int index){
        items.remove(index);

    }

    public int size(){
        return items.size();
    }
    
}
