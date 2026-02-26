package professor;

import person.Person;
import display.Displayable
;
public class Professor extends Person implements Displayable{
    private int empid;
    private String dept;
    public Professor(String name,int age,int empid,String dept){
        super(name, age);
        this.empid=empid;
        this.dept=dept;
    }
    @Override
    public void display(){
        System.out.println("Professor name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employeee id: "+empid);
        System.out.println("Department: +"+dept);
    }
}
