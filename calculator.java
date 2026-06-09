
import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char op;
        double Result=0;

        System.out.print("Enter first number: ");
        num1=sc.nextDouble();
        System.out.print("Enter the Operator (+,-,*,/,%,^): ");
        op=sc.next().charAt(0);
        System.out.print("Enter the second number:");
        num2=sc.nextDouble();

        switch (op) {
            case '+'->Result = num1+num2;
            case '-'->Result = num1-num2;
            case '*'->Result = num1*num2;
            case '/'->{
                if(num2==0){
                    System.out.println("Can't divide by Zero");
                }
                else{
                    Result=num1/num2;
                }
            }
            case '%'-> Result=num1%num2;
            case '^'->Result=Math.pow(num1, num2);
            default->System.out.println("Operator is invalid");
           
        }
         System.out.println(Result);
        
    }
}
