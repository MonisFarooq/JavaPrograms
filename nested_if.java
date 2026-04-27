public class nested_if {

    public static void main(String[] args) {
        boolean isStudent=true;
        boolean isSenior=false;
        double price=9.99;

        if(isStudent){
            if(isSenior){
            System.out.println("you get a senior discount of 20%: ");
            System.out.println("you get a student discount of 10%: ");
            price*=.7;
        }
        else{
            System.out.println("You get a studnt discount of 10%: ");
            price*=.9;
        }
        

        }
        if(isSenior){
            System.out.println("You get a senior discount of 20%: ");
            price*=.8;
        }
        System.out.printf("The price of the ticket is $%.2f ",price);
    }
    
}
