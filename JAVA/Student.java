import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    int marks;
    static int count=0;

    Student() {
        rollno=0;
        name="Not assigned";
        marks=0;
        count++;
    }
    Student(int r,String n,int m){
        rollno=r;
        name=n;
        marks=m;
        count++;
    }
    Student(Student s){
        rollno=s.rollno;
        name=s.name;
        marks=s.marks;
        count++;
    }
    void display(){
        System.out.println(rollno+"\t"+name+"\t"+marks+"\t");
    }
    static void displayCount(){
        System.out.println("Total count= "+count);
    }
    static void compare(Student s1,Student s2){
        if(s1.marks>s2.marks)
            System.out.println(s1.name +" has higher marks");
        else if(s1.marks<s2.marks)
            System.out.println(s2.name+" has higher marks");
        else
            System.out.println("Both have equal marks");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n=sc.nextInt();
        Student[] s =new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.println("Roll no: ");
            int r=sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name=sc.nextLine();
            System.out.println("Marks: "); 
            int m=sc.nextInt();

            s[i]=new Student(r,name,m);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].marks<s[j].marks){
                    Student temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("\nRank List\n");
        System.out.println("Roll no\tName\tMarks");
        for(Student st:s){
            st.display();
        }
        // Student s1 = new Student(102,"Neenu",89);
        // Student s2 = new Student(101,"Nithi",90);
        // Student s3 = new Student(s2);
        // s1.display();
        // s2.display();
        // s3.display();

        // Student.compare(s1,s2);
        if(n>=2){
            System.out.println("Comparison");
            Student.compare(s[0],s[1]);
        }
        Student.displayCount();

    }
}
