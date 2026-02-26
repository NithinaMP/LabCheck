import java.util.Scanner;

class Person{
    String name;
    String gender;
    String address;
    int age;
    Person(String name,  String gender,    String address,    int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);

    }
}
class Employee extends Person{
    int empid;
    String companyName;
    String qualification;
    int salary;
    Employee(String name,  String gender,    String address,    int age,int empid,    
        String companyName,    String qualification,    int salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.companyName=companyName;
        this.qualification=qualification;
        this.salary=salary;
    }
    
    void displayEmployee(){
        displayPerson();
        System.out.println("Employee Id: "+empid);
        System.out.println("Company name: "+companyName);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
    }
}
class Teacher extends Employee{
    int teacherId;
    String sub;
    String dept;
    Teacher(String name,  String gender,    String address,    int age,int empid,    
        String companyName,    String qualification,    int salary,int teacherId,
    String sub,    String dept){
        super(name,gender,address,age,empid,companyName,qualification,salary);
        this.teacherId=teacherId;
        this.sub=sub;
        this.dept=dept;
    }
    void displayTeacher(){
        displayEmployee();
        System.out.println("Teacher Id: "+teacherId);
        System.out.println("Subject: "+sub);
        System.out.println("Deprtment: "+dept);
    }
}
public class personMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of teachers: ");
        int n=sc.nextInt();
        sc.nextLine();
        Teacher[] t=new Teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter details of teacher "+(i+1));
            System.out.println("Name: ");
            String name=sc.nextLine();
            System.out.println("Gender: ");
            String gender=sc.nextLine();
            System.out.println("Address: ");
            String address = sc.nextLine();
            System.out.println("Age: ");
            int age=sc.nextInt();
            sc.nextLine();   // ✅ clear buffer

            System.out.println("Employee Id: ");
           int empid=sc.nextInt();
           sc.nextLine();   // ✅ clear buffer

            System.out.println("Company name: ");
            String companyName=sc.nextLine();
                System.out.println("Qualification: ");
            String qualification=sc.nextLine();
            System.out.println("Salary: ");
            int salary=sc.nextInt();
            sc.nextLine();   // ✅ clear buffer

            System.out.println("Teacher Id: ");
            int teacherId=sc.nextInt();
            sc.nextLine();   // ✅ clear buffer

            System.out.println("Subject: ");
            String sub=sc.nextLine();
            System.out.println("Department: ");
            String dept=sc.nextLine();
            t[i]=new Teacher(name,gender,address,age,empid,
                companyName,qualification,salary,teacherId,sub,dept);
                
        }
        System.out.println("\nTeacher Details");
        for(Teacher teacher:t){
            teacher.displayTeacher();
                        System.out.println("----------------------");

        }
    }
}
