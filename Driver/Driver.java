package Driver;

import java.util.Scanner;

import Container.Node;
import Container.StackQ;

public class Driver {
    public static void main(String[] args) {
        char inputChar;

        do {

            Scanner userInput = new Scanner(System.in);

            // Program menu options are displayed via these print statements
            System.out.println("User Menu:");
            System.out.println("Input Choice:");
            System.out.println("a. Enqueue in the queue");
            System.out.println("b. Dequeue from the queue");
            System.out.println("c. Peek from the Queue");
            System.out.println("d. Display the queue");
            System.out.println("e. Display enQStack and deQStack");
            System.out.println("f. Display size of the queue");
            System.out.println("g. Exit");

            // Validates that inputs are not integer values for the menu options
            // try
            // {
            // //Try Something
            // }
            // catch (InputMismatchException e)
            // {
            // inputChar = 'h';
            // }

            inputChar = userInput.next().charAt(0);

            if (Character.toString(inputChar).matches("^[a-gA-G]*$")) {
                System.out.println("\nvalid input.\n");
            } else {
                System.out.println("\nMenu options must be a letter between a-g. Your selection was outside of that "
                        + "range. Please make a valid selection.\n");
            }

            switch (inputChar) {
                case 'a': // Enqueue in the queue
                {
                    System.out.println("a");
                    break;
                }
                case 'b': // Dequeue from the queue
                {
                    System.out.println("b");
                    break;
                }
                case 'c': // Peek from the Queue
                {
                    System.out.println("c");
                    break;
                }
                case 'd': // Display the queue
                {
                    System.out.println("d");
                    break;
                }
                case 'e': // Display enQStack and deQStack
                {
                    System.out.println("e");
                    break;
                }
                case 'f': // Display size of the queue
                {
                    System.out.println("f");
                    break;
                }
                case 'g': // Exit loop and program
                {
                    System.out.println("g");
                    break;
                }
            }
        } while (inputChar != 'g');
    }
}
