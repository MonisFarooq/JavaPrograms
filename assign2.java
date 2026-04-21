
import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num=sc.nextInt();

        if(num>0){
            System.out.println("The number is positive. ");
        }
        else if(num<0){
            System.out.println("The number is negative. ");
        }
        else{
            System.out.println("The number is zero. ");
        }

        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is ODD");
        }

        if(num%5==0){
            System.out.println("The number is Multiple of 5");
        }
        else{
            System.out.println("The number is not a multiple of 5");
        }
        if(num>=100 && num<=999){
            System.out.println("It is a three digit number");
        }
        else{
            System.out.println("It is not a three digit number");
        }
    }
}
