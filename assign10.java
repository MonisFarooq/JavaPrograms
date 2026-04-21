
import java.util.Scanner;

public class assign10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        String n= String.valueOf(num);
        String result="";
        for(int i=0;i<n.length();i++){
            char ch= n.charAt(i);
            if(ch=='0')
                result +='1';
            else if(ch=='1')
                result+='0';
            else 
                result +=ch;
        }
        System.out.println(result);
    }
}