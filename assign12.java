
import java.util.Scanner;

public class assign12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements: ");

      
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int Even=0;
         int odd=0;

         for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                Even++;
            }
            else{
                odd++;
            }

        
         }

         for(int i=n-1;i>=0;i--){
            System.out.println( +arr[i]+" ");
         }
         System.out.println("Even elements = "+Even);
         System.out.println("Odd elements = "+odd);

        

    }
}
