package RujanLABjava;
import java.util.Scanner;

/**
 * This program demonstrates various array concepts in Java for the lab report.
 * The main class name is q3 as per the requirement.
 */
public class q3 {

    public static void main(String[] args) {
        // Calling the method for question 3a
        taskA();

        // Calling the method for question 3b
        taskB();

        // Calling the method for question 3c
        taskC();

        // Calling the method for question 3d
        taskD();

        // Printing personal details as required by the lab rules
        System.out.println("\n--- Lab Information ---");
        System.out.println("Lab No.: 03");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No: 22081013");
    }

    /**
     * Task 3a: Creates an array of the first 15 natural numbers and finds the sum
     * of the 3rd and last elements.
     */
    public static void taskA() {
        System.out.println("--- Task 3a: Sum of Array Elements ---");

        // Create a single dimension array of size 15
        int[] naturalNumbers = new int[15];

        // Store the first 15 natural numbers in the array
        for (int i = 0; i < naturalNumbers.length; i++) {
            naturalNumbers[i] = i + 1; // Natural numbers start from 1
        }

        // The 3rd element is at index 2
        int thirdElement = naturalNumbers[2];

        // The last element is at index (length - 1)
        int lastElement = naturalNumbers[naturalNumbers.length - 1];

        // Calculate the sum
        int sum = thirdElement + lastElement;

        System.out.println("The array of first 15 natural numbers has been created.");
        System.out.println("The 3rd element is: " + thirdElement);
        System.out.println("The last element is: " + lastElement);
        System.out.println("The sum of the 3rd and last element is: " + sum);
        System.out.println();
    }

    /**
     * Task 3b: Takes a 3x3 matrix from the user and displays its diagonal elements.
     */
    public static void taskB() {
        System.out.println("--- Task 3b: Matrix Operations ---");
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[][] matrix = new int[size][size];

        // Taking user input for the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Displaying the matrix
        System.out.println("\nThe entered matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Displaying the diagonal elements
        System.out.print("\nMain Diagonal elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.print("Anti-Diagonal elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1 - i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Task 3c: Demonstrates the concept of a jagged array.
     */
    public static void taskC() {
        System.out.println("--- Task 3c: Jagged Array Demonstration ---");

        // Declare a 2D array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Define the number of columns for each row
        jaggedArray[0] = new int[3]; // 1st row has 3 columns
        jaggedArray[1] = new int[4]; // 2nd row has 4 columns
        jaggedArray[2] = new int[2]; // 3rd row has 2 columns

        // Initialize the jagged array with some values
        int count = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = count++;
            }
        }

        // Displaying the elements of the jagged array
        System.out.println("Contents of the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Task 3d: Demonstrates the use of a for-each loop.
     */
    public static void taskD() {
        System.out.println("--- Task 3d: For-Each Loop Demonstration ---");
        
        // Create a simple 1D array
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Iterating through a 1D array using for-each loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }
}
