package collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void demonstrate(){
        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("Josiline");
        names.add("Paul");
        names.add("Simon");
        names.add("Judy");

        System.out.println(names);  //print all names

        System.out.println(names.get(2)); //retrieve information in a certain index use get

        names.set(1, "Sarah");    //replacing an element in the list use set
        
        names.remove(3);    //deleting an element from the list use remove

        System.out.println(names.contains("James"));   //check whether the element exists in the list use contains

        System.out.println(names.size());   //check the length of the list use size

        System.out.println(names);   

        // names.set(names.size(), "George");  //set replaces an elements, adds an element to the list
        names.add("george"); //adding elements to the list use add

        System.out.println(names); 


        String name = "Gwen";

        System.out.println(name.hashCode());

    }
}

//HashSet - fast lookups, no guaranteed insertion order
//LinkedHashset - guaranteed insertion order
//TreeSet - guaranteed sorted order
