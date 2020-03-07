package Driver;

import java.util.Scanner;

import Container.StackQ;
import Data.DataClass;
import Interface.QueueSpecs;

public class Driver {

    public static void main(String[] args) {

        char inputChar;
        int id = 0;

        QueueSpecs<DataClass> stackQ = new StackQ<DataClass>();

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
                System.out.println("\nMenu options must be a letter between a-g. Your"
                        + "selection was outside of that " + "range. Please make a valid selection.\n");
            }

            switch (inputChar) {
                case 'a': // Enqueue in the queue
                {
                    System.out.println("enter string to enqueue");

                    String input = userInput.next();
                    stackQ.enQ(new DataClass(input, ++id));

                    System.out.println("element " + input + " enqueued\n");
                    break;
                }
                case 'b': // Dequeue from the queue
                {
                    DataClass dequeuedItem = stackQ.deQ();

                    System.out.println("element dequeued. dataItem = " + dequeuedItem.getDataID() + " , dataName= "
                            + dequeuedItem.getDataName());
                    break;
                }
                case 'c': // Peek from the Queue
                {
                    DataClass peekedItem = stackQ.peek();

                    System.out.println("element peeked. dataItem = " + peekedItem.getDataID() + " , dataName= "
                            + peekedItem.getDataName());

                    break;
                }
                case 'd': // Display the queue
                {
                    System.out.println("Content of the queue is");
                    break;
                }
                case 'e': // Display enQStack and deQStack
                {
                    System.out.println("enQStack and deQStack are");
                    System.out.println(stackQ.toString());
                    break;
                }
                case 'f': // Display size of the queue
                {
                    System.out.println("Size of the queue is:" + stackQ.size());
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
