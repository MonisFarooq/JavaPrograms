
import java.util.Scanner;

public class assign3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the name of Student 1:");
        String name1=sc.next();

        System.out.print("Enter the marks of 3 subjects: ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        System.out.print("Enter the name of Student 2:");
        String name2=sc.next();

        System.out.print("Enter the marks of 3 subjects: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

       Student s1 = new Student(name1, m1, m2, m3);
       Student s2 = new Student(name2, n1, n2, n3);

       System.out.println("..! Student 1 details...!");
       s1.display();

       System.out.println("!...Student 2 details...!");
       s2.display();

       System.out.println("...Ranking...");
       s1.compare(s2);

    }
}

class Student{
    String name;
    int m1;
    int m2;
    int m3;
    int total;
    double percentage;

    Student(String name,int m1,int m2, int m3){
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;

    }

    int total_marks(){
        total=m1+m2+m3;
        return total;
    }

    double percentage(){
        percentage=total_marks()/3.0;
        return percentage;
    }
    void showGrade() {
        double p = percentage();

        if (p>=75) {
            System.out.println(name+" Grade A");
        }
        else if (p>=60) {
            System.out.println(name+"Grade B");
        }
        else if (p>=40) {
            System.out.println(name+"Grade C");
            
        }
        else{
            System.out.println(name + "You are fail");
        }
    }

    void check_fail(){

        if (m1<40) {
            System.out.println("Failed in Subject 1");
        }
        if (m2<40) {
            System.out.println("Failed in Subject 2");

        }
        if (m3<40) {
            System.out.println("Failed in Subject 3");
        }

    }
     void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + total_marks());
        System.out.println("Percentage: " + percentage());
        showGrade();
        check_fail();
        System.out.println();
    }

    void compare(Student s){
        if(this.total_marks()>s.total_marks()){
            System.out.println(this.name +"Rank 1");
        }
        else if (this.total_marks()<s.total_marks()) {
            System.out.println(s.name+"Rank 1");
        }
        else{
            System.out.println("Both have equal Rank.");
        }
    }
}
