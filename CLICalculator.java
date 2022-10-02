import java.util.Scanner;
import java.text.DecimalFormat;

public class CLICalculator {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        double num1, num2, result;
        boolean run = true;
        //sadly /n doesn't seem to work here for new lines
        while (run) {
            System.out.println("Welcome to the CLI Calculator");
            System.out.println(" ");
            System.out.println("Operations: ");
            System.out.println("a: Addition");
            System.out.println("s: Subtraction");
            System.out.println("m: Multiplication");
            System.out.println("d: Division");
            System.out.println("e: Exit");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            System.out.println("Choose your operation: ");
            char choice = input.next().charAt(0);
            System.out.println(" ");
            System.out.println("First Number: ");
            num1 = input.nextInt();
            System.out.println("Second Number:");
            num2 = input.nextInt();
            switch (choice) {
                case 'a':
                    // addition
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                // subtraction
                case 'b':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                // multiplication
                case 'c':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                    // division
                case 'd':
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + df.format(result));
                    break;
                //exit
                case 'e':
                    System.out.println("Goodbye!");
                    run = false;
                    break;

                default:
                    System.out.println("Unable to compute.");
                    break;
            }
        }
    }
}
