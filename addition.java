
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        int x, y, sum=0;
        System.out.println("Enter two numbers");
        Scanner s =new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        sum=x+y;
        System.out.println("Sum is:"+sum);
    }
}



