import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String [] args){
        
        int product = multiply();
        System.out.println("the product is " + product);

        int quotient = divide();
        System.out.println("the quotient is " + quotient);

       
        scan.close(); 
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }

    
    
}
