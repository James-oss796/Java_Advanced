package generics.interfaces;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository<Student>{

    private List<Student> students = new ArrayList<>();
    
    
    public void save(Student student){
        students.add(student);
    }

    
    public Student findById(int id){
        for(Student student : students){
            if( student.getId()== id){
                return student;

            }
        }
        return students.get(id);
    }
    
    public List<Student> findAll(){
    return students;

    }

    public void delete(int id){
        students.remove(id);
    }
}
