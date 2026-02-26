package student;
import person.Person;
import display.Displayable;

public class Student extends Person implements Displayable {
    private int studid;
    private String course;
    public Student(String name,int age,int studid,String course){
        super(name,age);
        this.studid=studid;
        this.course=course;
    }
    @Override
    public void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student id: "+studid);
        System.out.println("Student course: "+course);
    }
}