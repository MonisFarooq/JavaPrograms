import java.util.Scanner;

public class if_statement {
    public static void main(String[] args){
        //if statement = performs a block of code if itd condition is true
        Scanner sc=new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;
        //Group 1
        
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your age: ");
        age =sc.nextInt();

        System.out.print("Are you a student true/false: ");
        isStudent=sc.nextBoolean();

        //if else statements
        if(name.isEmpty()){
            System.out.println("You haven't entered your name: ");
        }
        else {
            System.out.println("Hello "+ name + " Welcome");

        }


        //Group 2   Nested if else statement
        if(age>=60){
            System.out.println("You are a Senior citizen..");
        }
        else if (age>=18) {
            System.out.println("You are an adult.."); 
        }
        else if (age<0) {
            System.out.println("You are not born yet..");
        }
        else if (age==0) {
            System.out.println("You are just born..");
        }
        else{
            System.out.println("You are a child..");
        }
        sc.close();

        //Group 3
        //if else statements
        if(isStudent){
            System.out.println("You are a student..! ");
        }
        else{
            System.out.println("You are NOT a student..! ");
        }
    }
}
