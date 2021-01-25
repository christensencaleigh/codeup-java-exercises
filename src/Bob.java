import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ask a question or say something to Bob!!!");
        String userInput = scan.nextLine();
        boolean question = userInput.indexOf("?") != -1;
        boolean exclamation = userInput.indexOf("!") != -1;


        if(question) {
            System.out.println("Sure.");
        } else if(exclamation) {
            System.out.println("Whoa, chill out!");
        }
    }
}
