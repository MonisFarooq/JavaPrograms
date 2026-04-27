
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {


        //Compound intrest calculator
        Scanner sc= new Scanner(System.in);

        double principal;
        double rate;
        int TimesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principal Amount: ");
        principal=sc.nextDouble();

        System.out.print("Enter the rate (in %): ");
        rate=sc.nextDouble()/100;

        System.out.print("Enter the number of years TimesCompounded: ");
        TimesCompounded=sc.nextInt();

        System.out.print("Enter the number of years:");
        years=sc.nextInt();
        
        amount = principal*Math.pow(1+rate/TimesCompounded,TimesCompounded*years);
        System.out.printf("The amount after %d is $%.2f",years,amount);

    }
}
