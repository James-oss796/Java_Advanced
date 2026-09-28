package generics.methods;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> names= List.of("Gwen", "Alice","Brian");
        
        String firstName= GenericMethods.first(names);
        String lastName= GenericMethods.last(names);
        GenericMethods.printAll(names);

    

    }
}
