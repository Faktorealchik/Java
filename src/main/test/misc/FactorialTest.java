package misc;

import java.util.Scanner;

import static misc.Factorial.factorial;

public class FactorialTest {


    /**
     * The main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        //If user does not enter an Integer, we want program to fail gracefully, letting the user know why it terminated
        try {
            int number = input.nextInt();

            //We keep prompting the user until they enter a positive number
            while (number < 0) {
                System.out.println("Your input must be non-negative. Please enter a positive number: ");
                number = input.nextInt();
            }
            //Display the result
            System.out.println("The factorial of " + number + " will yield: " + factorial(number));

        } catch (Exception e) {
            System.out.println("Error: You did not enter an integer. Program has terminated.");
        }
        input.close();
    }
}