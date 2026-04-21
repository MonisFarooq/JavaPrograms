
import java.util.Scanner;

public class rect_area {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter width: ");
        width=s.nextDouble();
        System.out.println("Enter height: ");
        height=s.nextDouble();

        area=width*height;

        System.out.println("Area of rectangle is "+area);
        s.close();

    }
}
