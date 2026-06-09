
import java.util.Scanner;

public class temp_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;
        System.out.print("Enter the temperature:");
        temp=sc.nextDouble();
        System.out.print("Convert the temperature to celcius or farenhiet (C or F)? ");
        unit=sc.next().toUpperCase();

        newtemp=(unit.equals("C"))? (temp-32)*5/9:(temp*9/5)+32;
        System.out.printf("%.1f°%s", newtemp, unit);
    }
}
