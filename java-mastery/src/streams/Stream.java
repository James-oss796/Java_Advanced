package streams;

import java.util.ArrayList;
import java.util.List;



public class Stream {

    public static void main(String[] args){

        List<Student> student = new ArrayList<>();
        student.setCourse
        List<Integer> numbers = List.of(1, 2, 3, 4);

        // for(Integer num : numbers){
        //     if(num % 2 == 0){
        //         System.out.println(num);
        //     }
        // }
        List<Integer> doubled = numbers.stream()
                                            .map(n->n*2)
                                            .toList();

        numbers.stream()
                    .filter(num -> num%2 == 0)
                    .forEach(System.out::println);

        System.out.println(doubled);

        List<String> names = student.stream()
                                        .filter(Student::getIsActive)
                                        .filter(student -> student.getCourse().equals("Computer Science"))
                                        .map(Student::getName)
                                        .toList();

        System.out.println(names);


    }
    
}
