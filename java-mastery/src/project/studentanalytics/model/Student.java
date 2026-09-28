package project.studentanalytics.model;

import java.util.Objects;
public class Student implements Identifiable{
    private final int id;
    private final String name;
    private final String email;
    private final String course;
    private final int year;
    private final double gpa;

    public Student(int id, String name, String course, String email, int year, double gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.gpa = gpa;
        this.year = year;

    }

    public String getName(){
        return name;

    }

    public String getCourse(){
        return course;
    }

    public String getEmail(){
        return email;
    }

    public int getYear(){
        return year;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public int getId(){
        return id;
    }

    public boolean isHighAchiever(){
        return gpa>=3.5;
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                '}';
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Student other)){
            return false;
        }

        return id == other.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

       
}
