package consoleIO;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
//        System.out.println("The value of pi is approximately: " + pi);
        System.out.printf("The value of pi is approximately: %.2f%n", pi );


//        Explore the Scanner Class
        Scanner scanner = new Scanner(System.in);

//        #1 Prompt a user to enter a integer and store that value in an int variable using the nextInt method. What happens if you input something that is not an integer?
//        System.out.print("Enter an Integer: ");
//        Integer userInt = scanner.nextInt();
//        an error message occurs when I input something other than an Integer, wrong data type

//        #2 Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. What happens if you enter less than 3 words? What happens if you enter more than 3 words?
//        System.out.print("Enter 3 words: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("Here is what you entered: %s%n", userInput);

//        #3 Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. Do you capture all the words?
//        System.out.print("Enter a sentence: ");
//        String userInput2 = scanner.next();
//        System.out.printf("Here is what you entered: %s%n", userInput2);
//        no it did not capture all the words

//        #4 Rewrite the above example using the nextLine method
//        System.out.print("Enter a sentence: ");
//        String userInput2 = scanner.nextLine();
//        System.out.printf("Here is what you entered: \"%s\"%n", userInput2);

//        Calculate the perimeter and area of Codeup's classrooms

//        #1 Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type. Assume that the rooms are perfect rectangles and that the user will enter valid numeric data for length and width
        System.out.print("Enter the length and width of a Codeup classroom: ");
        String codeupClassroom = scanner.nextLine();



    }
}
