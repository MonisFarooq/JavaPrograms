
import java.util.Scanner;

public class enhanced_switches {
    public static void main(String[] args) {
        

        //enchanced switches= A replacement to many else if statements (Java14 Feature)

        Scanner sc = new Scanner(System.in);

        String day;
        System.out.print("Enter the day of the week: ");
        day= sc.next();

        switch (day) {
            case "Monday" -> System.out.println("It is a weekday.");       //Here this (->) means that what the condition is before it if that is true do the this which is given after the arrow sign
            case "Tuesday"-> System.out.println("It is a weekday");
            case "Wednesdat"-> System.out.println("It is a weekday");
            case "Thursday"-> System.out.println("It is a weekday");
            case "Friday"-> System.out.println("It is a weekday");
            case "Saturday"-> System.out.println("It is a weekend");
            case "Sunday"-> System.out.println("It is a weekend");
            default -> System.out.println(day+" Is not a day");
        }


        //we can also write multiple switch cases like below if they are performing same task

        switch(day){
            case "Monday","Tuesday", "Wednesday","Thursday","Friday"-> System.out.println("It is a weekday");
            case "Saturday","Sunday"-> System.out.println("It is a weekend");
            default -> System.out.println(day+" Is not a day");
        }
    }
}
