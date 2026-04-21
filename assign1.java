
import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Enter a five digit number");
        num=s.nextInt();
        int evenSum=0;
        int oddSum=0;
        int iteration=1;
        if(num>=10000 && num<=99999){
            while(num>0){
                int digit=num%10;
                num=num/10;
                iteration++;
                if(iteration%2==0){
                    oddSum=oddSum + digit;
                }
                else{
                    evenSum=evenSum + digit;
                }
            
            }
            System.out.println("Sum of the digits at ODD positions is: " + oddSum);
            System.out.println("Sum of the digits at EVEN positions is: " + evenSum);
            System.out.println("Difference between the two is: " + (evenSum-oddSum));
        }
        else{
            System.out.println("Entered number is not valid.. ");
        }
    }
    
}
