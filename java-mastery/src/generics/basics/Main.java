package generics.basics;

public class Main {
    public static void main(String[] args) {
        //in box<T> , T can be a String, an Integer or a Double.   whatever you pass as an argument must be of the same type as declared by T.
        Box<String> box = new Box<>("Hello, World!");
        Box<Integer> intBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println(box.getValue());
        System.out.println(intBox.getValue());
        System.out.println(doubleBox.getValue());
        box.setValue("Hello, Gwen");
        System.out.println(box.getValue());


        GenericPair<String, Integer> student = new GenericPair<>("Gwen", 20);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());

        Repository<Student> students = new Repository<>();

        students.add(new Student(1, "James", "Computer Science"));
        students.add(new Student(2, "Simon", "Software Engineer"));
        students.add(new Student(3, "Judy", "Data Science"));

        Student stud = students.get(1);

        System.out.println(stud.getName());
        System.out.println(students.size());

        students.remove(1);

        System.out.println(students.size());





    }
}
