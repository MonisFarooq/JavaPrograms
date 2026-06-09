package mainapp;

import electricity.Billcalculator;
import electricity.Domestic;
import electricity.Comercial;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Electricity Bill Calculator");
        System.out.println("1. Domestic Consumer");
        System.out.println("2. Commercial Consumer");
        System.out.print("Enter Consumer Type: ");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        Billcalculator bill;

        switch(choice) {

            case 1:
                bill = new Domestic(name, id, units);
                ((Domestic) bill).displayBill();
                break;

            case 2:
                bill = new Comercial(name, id, units);
                ((Comercial) bill).displayBill();
                break;

            default:
                System.out.println("Invalid Consumer Type!");
        }

        sc.close();
    }
}