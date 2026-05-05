
import java.util.Scanner;



public class string_methods {
    public static void main(String[] args) {
        String name = "Password";

       // int length = name.length();  //this gives the total length of the string including space

        //char l=name.charAt(2);  // this gives the character at a given index

        //int index = name.indexOf("i");  // this gives the index number of a particular character

        //int lastindex = name.lastIndexOf("o");  //this returns the last index of the character

        //name = name.toUpperCase();   //Uppercase
        //name= name.toLowerCase();       //Lowercase

        //name= name.trim();   //This eliminates the whitespaces before and after 
        //name = name.replace("i", "s"); //target is replaced with replacement
        //System.out.println(name.isEmpty());   //gives the boolean value if the string is empty or not we can also use this in if statement

        /*if (name.isEmpty()) {
            System.out.println("Your name is Empty");
            
        }
        else{
            System.out.println("Hello "+name);
        }
        System.out.println(length);
        System.out.println(l);
        System.out.println(index);
        System.out.println(lastindex);*/

       /* if (name.contains(" ")) {         //.contains returns whether the string contains that particular part or 
        // not  here we are checking for space we can also check for a character or symbol
            System.out.println("Your name contain a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any space");
        }*/

        //To check if the two strings are equal or not and this is case sensitive but to ignore case sensitivity we use  .equalsIgnoreCase()

        /*if (name.equalsIgnoreCase("password")) {
            System.out.println("your name cannot be password");
            
        }
        else{
            System.out.println("Hello "+ name);
        }*/

        //NOW WE ARE GOING TO SEE .substring()
        //.subtrings()= A method used to extract a portion of a string 
        // String.substring(start,end)

        Scanner sc=new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email=sc.nextLine();
        if (email.contains("@")) {
            username=email.substring(0,email.indexOf("@"));   //here we are extracting a part of email and use that as username
            domain=email.substring(email.indexOf("@") +1);
            System.out.println("username is: "+username);
            System.out.println("Domain is: "+domain);
        }
        else{
            System.out.println("You email must include @: ");
        }
       
       
        
        

    }

}
