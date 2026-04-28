
import java.util.Scanner;

public class assign11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter the elements:");
        

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int sum=0;
            int max=arr[0];
            int min=arr[0];

        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }            
        double avg=(double)sum/n;

        System.out.println("Sum is: " +sum);
        System.out.println("maximum is: " +max);
        System.out.println("minimum is: " +min);
        System.out.println("average is: " +avg);
    }
}
