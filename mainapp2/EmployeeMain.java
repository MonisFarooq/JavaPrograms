package mainapp;

import employee.*;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Salary Management");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");

        System.out.print("Enter Employee Type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        SalaryCalculator emp;

        switch(choice) {

            case 1:

                System.out.print("Enter Basic Pay: ");
                double basicPay = sc.nextDouble();

                emp = new PermanentEmployee(name, id, basicPay);
                ((PermanentEmployee) emp).displaySalary();

                break;

            case 2:

                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();

                emp = new ContractEmployee(name, id, hours, rate);
                ((ContractEmployee) emp).displaySalary();

                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}