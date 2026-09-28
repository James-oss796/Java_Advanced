package test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList box=new ArrayList();

        box.add("James");
        box.add(20);
        box.add(true);

        String name = (String) box.get(1);

        System.out.println(name);


    }
}
