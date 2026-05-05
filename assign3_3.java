import java.util.Scanner;

public class assign3_3 {
    public static void main(String[] args) {
       
        double l1;
        double b1;
        double l2;
        double b2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of first rectangle: ");
        l1=sc.nextDouble();
        System.out.print("Enter the breadth of first rectangle: ");
        b1=sc.nextDouble();

        System.out.print("Enter the length of second rectangle: ");
        l2=sc.nextDouble();
        System.out.print("Enter the breadth of second rectangle: ");
        b2=sc.nextDouble();


        rectangle r1=new rectangle(l1, b1);
        rectangle r2=new rectangle(l2, b2);

        System.out.println("Area of rectangle 1 is: " +r1.area());
        System.out.println("Perimeter of rectangle 1 is: "+r1.perimeter());
        r1.isSq();

        System.out.println("Area of rectangle 2 is: " +r2.area());
        System.out.println("Perimeter of rectangle 2 is: "+r2.perimeter());
        r2.isSq();
        r1.compare(r2);
    }
}

class rectangle{

    double l;
    double b;

    rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }

    double area(){
        return l*b;
    }

    double perimeter(){
        return 2*(l+b);
    }

    void isSq(){
        if (l==b) {
            System.out.println("It is a square: ");
        }
        else{
            System.out.println("It is not a square: ");
        }
    }
    double diagonal() {
        return Math.sqrt(l * l + b * b);
    }
    

    void compare(rectangle r){
        if (this.area()>r.area()) {
            System.out.println("First rectangle has larger area.");
            
        }
        else if (this.area()<r.area()) {
            System.out.println("Second rectangle has larger area.");
        }

        else{
            System.out.println("Both have same area.");
        }

        if (this.diagonal()>r.diagonal()) {
            System.out.println("First rectangle have longer diagonal.");    
        }
        else if (this.diagonal()<r.diagonal()) {
            System.out.println("Second rectangle has longer diagonal.");
            
        }
        else{
            System.out.println("Both diagonals are equal.");
        }
    }
}
