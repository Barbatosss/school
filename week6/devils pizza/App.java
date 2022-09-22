import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
        
    }

    static void myOrder() {

        System.out.println("Welcome to Devils Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Purgatory Pizza");
        System.out.println("Enter B if you want a Hades Pizza");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;
         
        switch (choice) {
            case 'A':
                pizza = "Purgatory Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Hades";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
        System.out.println("Select sizes mf");
        System.out.println("press S for smol");
        System.out.println("press M for medium");
        System.out.println("press V to play valorant");

        System.out.print("Enter your size here: ");
        char size = scan.next().charAt(0);

        String sizeString = "";

        switch (size){
            case 'S':
            sizeString = "small";
            break;
            case 'M':
            sizeString = "medium";
            break;
            case 'V':
            sizeString = "valorant";
            break;
        default:
            System.out.println("labas");
             return;

        }
        System.out.println("Enter T for thin crust");
        System.out.println("Enter C for stuffed crust");
        System.out.print("Enter your crust here: ");
        char crust = scan.next().charAt(0);

        String crusString = "";

        switch (crust){
            case 'T':
            crusString = "thin crust";
            break;
            case 'C':
            crusString = "stuffed";
            break;
        default:
            System.out.println("default");
            return;

       }
       System.out.println("how many pizza");
       int quantity = scan.nextInt();
       System.out.println("your order is "+ pizza + "\n" + sizeString + " size" + "with a " + crusString );
       System.out.println("total cost is " + quantity*price);
    
   
       
    }
    
}
