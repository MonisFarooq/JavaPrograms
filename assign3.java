
import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        int sum=0;
        int product=1;
        System.out.println("Enter a two digit number");
        num=s.nextInt();
        if(num>=10 && num<=99){
            int temp = num;
            while(temp>0){
                int d1= temp%10;
                temp=temp/10;
                sum=sum+d1;
                product=product*d1;
            } 
        System.out.println("Sum of two digits is: " + sum);
        System.out.println("Product of two digits is: " + product);
      
        
        if(num==sum+product){
            System.out.println("The number is a special");
        }
        else{
            System.out.println("The number is not special");
        }
      

        } else{
            System.out.println("Not a two digit number");
        }
    }
    
}
