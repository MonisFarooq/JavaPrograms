
import java.util.Scanner;


public class assign9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.print("Enter the number of terms you want to print: ");
        num=s.nextInt();

        int i=1;
        int j=2;
        while(i<=num){
            System.out.print(j+" ");
            i++;
            if(i%2==0){
                j=j*3;
            }
            else{
                j=j+1;
            }
        }
    }
}
