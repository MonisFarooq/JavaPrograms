import java.util.Scanner;


public class assign3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Calculator c = new Calculator(a, b, op);
        c.calculate();
    }
}

class Calculator {
    double a, b;
    char op;

    Calculator(double a, double b, char op) {
    this.a = a;
    this.b = b;
    this.op = op;
    }

    void calculate() {
    
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result = " + (a / b));
                }   break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

