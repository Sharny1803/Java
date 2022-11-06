import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("----");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Please provide two numbers");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        sc.nextLine();

        System.out.println("Please choose one of of the options: Add, Subtract, Multiply, Divide ");
        String option = sc.nextLine();
        option = option.toUpperCase();


        switch (option) {
            case "ADD":
                System.out.println("Sum is: " + (numberOne + numberTwo));
                break;
            case "SUBTRACT":
                System.out.println("Difference is: " + (numberOne - numberTwo));
                break;
            case "MULTIPLY":
                System.out.println("Product is: " + (numberOne * numberTwo));
                break;
            case "DIVIDE":
                System.out.println("Ratio is: " + (numberOne / numberTwo));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
