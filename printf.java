public class printf {
    public static void main(String[] args) {
        String name="Monis";
        double height=172.5;
        char FL='M';
        int Age=22;
   //printf=is a method used to format output
   // %[flags][width][.precision][specifier-character]

   
        System.out.printf("Hello %s\n", name);
        System.out.printf("You are %d years old\n",Age );
        System.out.printf("your height is %f\n", height);

        
        double price1=29.33;
        double price2=-10.22;
        double price3=100.12;


         //precision(.)
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);


        //flags:
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed is ()
        // space = display a minus if negative, space if positive


        //(
        System.out.printf("%(f\n",price1);
        System.out.printf("%(f\n",price2);
        System.out.printf("%(f\n",price3);


        // space
        System.out.printf("% f\n", price1);
        System.out.printf("% f\n", price2);
        System.out.printf("% f\n", price3);

        //  ,
        System.out.printf("%,f\n", price1);
        System.out.printf("%,f\n", price2);
        System.out.printf("%,f\n", price3);

        //+
        System.out.printf("%+f\n", price1);
        System.out.printf("%+f\n", price2);
        System.out.printf("%+f\n", price3);

        // [width]
        //0 = zero padding 
        //number = right justified padding
        //negative(-) = left justified padding

        int n1=12;
        int n2=345;
        int n3=6789;

        // 0 means zero padding and 4 means how many
        System.out.printf("%04d\n",n1);
        System.out.printf("%04d\n",n2);
        System.out.printf("%04d\n",n3);

        //number
        System.out.printf("%4d\n",n1);
        System.out.printf("%4d\n",n2);
        System.out.printf("%4d\n",n3);


        //(-)
        System.out.printf("%-2d\n",n1);
        System.out.printf("%-2d\n",n2);
        System.out.printf("%-2d\n",n3);

    }
}
