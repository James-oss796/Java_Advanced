package functionalprogramm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Names{
    public static void main(String[] args){
        List<String> names = List.of("James", "Paul", "Simon", "Gwen");

        for(String name : names){
            System.out.println(name);
        }

        List<String> result = new ArrayList<>();

        // for(String name : names){
        //     if(name.length()> 4){
        //         result.add(name);
        //     }

        // name -> name.length()>4

        // A functional interface is an interface containing exactly one abstract method.

        //we have four main functions, - predicate, consumer, producer,function.
        //java.util.function

        //predicate<T> - answers is this true or false?
        //boolean test(T t);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(5));

        Predicate<Student> isComputerScience = student -> student.getCourse().equals("Computer Science");
        Student student = new Student("Computer Science");
        System.out.println(isComputerScience.test(student));


        //Consumer<T> - it takes something and does something with it but doesnt return results.
        //void accept(T t);

        Consumer<String>  printer = name -> System.out.println(name);
        printer.accept("James");

        //Function<T, R> - it transforms one thing to another
        //you use apply(T t)
        Function<String, Integer> length = text -> text.length();

        int res = length.apply("James");
        System.out.println(res);

        //Supplier<T> - it takes nothing and produces a value
        Supplier<Double> randomNumber = () -> Math.random();
        double value = randomNumber.get();
        System.out.println(value);

        //Method reference
        //object::method

        //Function<String, Integer> length = text -> text.length();
        //Function<String, Integer> length = String::length;
    }



    }
