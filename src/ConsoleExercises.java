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
        System.out.print("Enter an Integer: ");
        int userInt = scanner.nextInt();
        System.out.printf("Your number is %d", userInt);
        System.out.println();
//        an error message occurs when I input something other than an Integer, wrong data type

//        #2 Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. What happens if you enter less than 3 words? What happens if you enter more than 3 words?
        System.out.print("Enter 3 words: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();


//        #3 Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. Do you capture all the words?
        System.out.print("Enter a sentence: ");
        String userInput2 = scanner.next();
        System.out.printf("Here is what you entered: %s%n", userInput2);
//        no it did not capture all the words. the next method will only see the first token

//        #4 Rewrite the above example using the nextLine method
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Here is what you entered: \"%s\"%n", sentence);

//        Calculate the perimeter and area of Codeup's classrooms

//        #1 Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type. Assume that the rooms are perfect rectangles and that the user will enter valid numeric data for length and width
        System.out.print("Enter the length of your classroom: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the width of your classroom: ");
        double width = Double.parseDouble(scanner.nextLine());

//        #2 Display the area and perimeter of that classroom. The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        System.out.printf("Area of classroom: %.1f%n", length*width);
        System.out.printf("Perimeter of classroom: %.1f%n", (2 * length + 2*width));

    }
}
