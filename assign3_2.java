
import java.util.Scanner;

public class assign3_2 {
    public static void main(String[] args) {
        double r1;
        double r2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of first circle: ");
        r1=sc.nextDouble();
        System.out.print("Enter the radius of second circle: ");
        r2=sc.nextDouble();


        
        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        System.out.println("Area of Circle 1 = " + c1.area());
        System.out.println("Circumference of Circle 1 = " + c1.circumference());

        System.out.println("Area of Circle 2 = " + c2.area());
        System.out.println("Circumference of Circle 2 = " + c2.circumference());

        c1.compare(c2);
        c1.canFit(c2);

    }
}

class Circle {
    double radius;

    
    Circle(double radius) {
        this.radius = radius;
    }

   
    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    
    void compare(Circle c) {
        if (this.area() > c.area()) {
            System.out.println("First circle is larger");
        } else if (this.area() < c.area()) {
            System.out.println("Second circle is larger");
        } else {
            System.out.println("Both circles are equal");
        }
    }


    void canFit(Circle c) {
        if (this.radius < c.radius) {
            System.out.println("First circle can fit inside second circle");
        } else if (this.radius > c.radius) {
            System.out.println("Second circle can fit inside first circle");
        } else {
            System.out.println("Both circles are same size");
        }
    }
}
