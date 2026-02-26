package psmain;
// abstract class Person{
//     String name;
//     int age;

//     Person(String name,int age){
//         this.name=name;
//         this.age =age;
        
//     }
//     abstract void display();
// }
// interface Disp{
//     void display();
// }

// class Student{
//     int studid;
//     String course;
//     Student(int studid,String course){
//         this.studid=studid;
//         this.course=course;
//     }
//     void display(){
//         System.out.println("Student id: "+studid);
//         System.out.println("Student course: "+course);
//     }
// }
// class Professor{
//     int empid;
//     String dept;
//     Professor(int empid,String dept){
//         this.empid=empid;
//         this.dept=dept;
//     }
//     void display(){
//         System.out.println("Employeee id: "+empid);
//         System.out.println("Department: +"+dept);
//     }
// }
import student.Student;
import professor.Professor;
public class PSMain {
    public static void main(String[] args){
        Student s1=new Student("nithina", 21, 121, "mca");
        Student s2=new Student("Nihti", 21, 122, "mca");
        Professor p1=new Professor("Nisha", 34, 301, "cs");

        Student s3=new Student("rohit", 21, 123, "mba");
        Student s4=new Student("Tejas", 21, 124, "mba");
        Professor p2=new Professor("Megha", 34, 301, "commerce");
        
        System.out.println("Batch 1");
        p1.display();
        s1.display();
        s2.display();

         System.out.println("Batch 2");
        p2.display();
        s3.display();
        s4.display();
    }
}
