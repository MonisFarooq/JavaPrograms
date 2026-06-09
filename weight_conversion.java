
import java.util.Scanner;

public class weight_conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion Program");
        System.out.println("1: convert weight kgs to lbs: ");
        System.out.println("2: convert weight lbs to kgs:");
        System.out.print("Choose an option: ");
        choice=sc.nextInt();

        if (choice==1) {
            System.out.print("Enter the weight in kgs: ");
            weight=sc.nextDouble();
            newWeight=weight* 2.20462;
            System.out.println("The new Weight in lbs is: "+newWeight);
        }
        else if(choice==2){
            System.out.print("Enter the weight in lbs: ");
            weight=sc.nextDouble();
            newWeight=weight* 0.453592;
            System.out.println("The new weight in kgs is: " +newWeight);

        }
        else{
            System.out.println("NOT a valid choice:");
        }
        sc.close();
    }
}
