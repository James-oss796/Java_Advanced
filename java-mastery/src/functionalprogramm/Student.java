package functionalprogramm;

import java.math.BigInteger;

public class Student {
    private String course;
    private String name;
    private String email;
    private boolean isActive;
    private BigInteger id;

    public Student(String course){
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return course;
    }

    public BigInteger getId(){
        return id;
    }

    public boolean getIsActive(){
        return isActive;
    }


}
