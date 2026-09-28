package generics.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class InMemoryRepository<T extends Identifiable> implements Repository<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public void save(T item){
        items.add(item);
    }

    @Override
    public List<T> findAll(){
        return items;
    }

    @Override
    public T findById(int id){
        for(T item : items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }


    //also use this
    //@Override
    //public void delete(int id){
    //     items.removeif(item-> item.getId() == id);
    //}
    @Override
    public void delete(int id){
        Iterator<T> iterator = items.iterator();


        while(iterator.hasNext()){
            T item = iterator.next();
            if(item.getId() == id){
                iterator.remove();
                return;
            }
        }    }   
}
