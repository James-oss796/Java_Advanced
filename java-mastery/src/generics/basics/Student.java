package generics.basics;

public class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course){
        this.id=id;
        this.course=course;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getCourse(){
        return course;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id =id;
    }
    

    public void setCourse(String course){
        this.course=course;
    }

    public void setName(String name){
        this.name=name;
    }
}
