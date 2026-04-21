
import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        
        System.out.print("Enter which item you need? ");
        item=s.nextLine();
        System.out.print("What is the price for each? ");
        price=s.nextDouble();
        System.out.print("How much do you need? ");
        quantity=s.nextInt();

        total=price*quantity;
        System.out.println("\nYou have bought "+ quantity +" "+ item +"/s");
        System.out.print("Your Total cost is: " + currency + total);

        s.close();
        
    }
}
