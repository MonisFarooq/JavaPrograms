
import java.util.Scanner;

public class math {
 public static void main(String[] args) {

    System.out.println(Math.PI);
    System.out.println(Math.E);
 
    double number;
    number=Math.sqrt(9);   //we are calculating the square root of a number
    number=Math.pow(2,3);   // here we are calculating the power
    number=Math.round(3.11); //here we are rounding the number "round" rounds the number to which it is close
    number=Math.ceil(5.11);  // here we round the number "ceil" it rounds the number to the higher number
    number=Math.min(10,12);   //It finds the minimum of the number
    number=Math.max(100,200);   //It finds the maximum of the number
    number=Math.abs(-3);   //here we get the absolute number (positive number)
    System.out.println(number); 

    Scanner sc=new Scanner(System.in);
    double a;
    double b;
    double c;

    System.out.print("Enter the length of side A: ");
    a=sc.nextDouble();
    System.out.print("Enter the length of side B: ");
    b=sc.nextDouble();

    c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("The Hypotenuse of side(c) is "+c+"cm");


 }
}
 