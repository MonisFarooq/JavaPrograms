
import java.util.Scanner;

public class assign8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int count=0;

        System.out.print("Enter the number: ");
        num=sc.nextInt();
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            temp=temp/10;
        if(num%digit==0){
            count++;
        }
        }
        System.out.println("The number of digits of  "+num +" that evenly divides it is: "+count);
    }
}
