import java.util.Random;
public class random{

    public static void main(String[] args){

        Random r=new Random();
        int n1;
        int n2;
        int n3;
        n1=r.nextInt(1,7);   //here we are giving a range of random numbers 1 is inclusive and 4 is exclusive
        n2=r.nextInt(1,7);   //here we are giving a range of random numbers 1 is inclusive and 4 is exclusive
        n3=r.nextInt(1,7);   //here we are giving a range of random numbers 1 is inclusive and 4 is exclusive
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}