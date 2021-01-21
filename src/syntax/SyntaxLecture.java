package syntax;

public class SyntaxLecture {

    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
        int number;

        // Assignment expressions
        number = 7;  // = one equal is just an assignment in Java

        // Any use of ++ or --
        //pre-decrement
        --number; // this will be decremented BEFORE it's evaluated

        System.out.println("The number's value after pre-decrementing is: " + number);
        //post-increment
        number++; // this will be incremented AFTER it's evaluated

        //shortcut for System.out.println is .sout
        System.out.println("The number's value after post-incrementing is: " + number);

        System.out.println("Pre-decrementing " + number + " = " + --number);
        System.out.println("Post-decrementing " + number + " = " + number++);

        System.out.println("Now, the number = " + number);

        // Method invocations
        Math.random(); // call the "random()" method from the Math class

        //say we wanted to assign a random number to a variable
//        number = Math.random(); this doesnt work because 'number' is of type 'int' and Math.random() returns a 'double' type
        double randomNumber = Math.random();

        // Object creation expressions


        // ================== COMMENTS (s-4)


//        see JavaDocTest in docs package


        // ================== DATA TYPES (s-5, 6, 7)


        // use the smallest type needed for the job

        // primitive types...

//            byte age = -32;
//        System.out.println(age);
//            short minimumAnnualSalary = 15080;
        int distanceToSaturn = 1200000000;
        long numberOfHumanCells = 3000000000L; // L needed for compiler, to indicate it is long
        System.out.println(numberOfHumanCells);
        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler, to indicate it is float
        System.out.println(lengthOfBacteriaInInches);
        double widthOfAtomInMeters = .00000000001;
        char seatingSection = 'M'; // must wrap in single quotes
        boolean everythingIsAwesome = false;

        // strings (not a primitive type)
        //reference type data refers to a location in memory, holding the contents of that variable
        String thisIsAString = "Hello";
        String anotherString = "Hello";

        if(thisIsAString == anotherString) {
            System.out.println("The two are equal, from double equals");
        }

        if(thisIsAString == "Hello") {
            System.out.println("Two are equal comparing reference string to Hello");
        }
        //correct way to write the above conditional check
        if(thisIsAString.equals(anotherString)) {
            System.out.println("We used .equals, and they are equivalent");
        }

        if(thisIsAString.equals("Hello")) {
            System.out.println("We have a match for 'Hello' using .equals");
        }



//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello\nWorld");
        System.out.println("Hello");
        System.out.println("World");
        //both of these produce the same output

        //want to system out something like Hello, "groovy" world
        System.out.println("Hello, \"groovy\" World");

        char someLetter = 'Y';
        System.out.println(someLetter);

        //create a string and then system out the first character in that string
        String myName = "Caleigh";
        System.out.println(myName.charAt(0));
        System.out.println(myName.offsetByCodePoints(0, 3));
        // ================== VARIABLES (s-8)

        // declaration separate from initialization
        int faveNumber; // declared the variable
        faveNumber = 42; //initialized the variable to the value 42

        //declare and initialize in the same line
        int myFaveNumber = 42;


        // declaration and initialization


        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum
//        String if = "Caleigh"; // "if" is a reserved word, so you can't name a variable with this keyword

        // ================== CONSTANTS (s-10)

        // see curriculum

//        final is the keyword for a constant variable
        final double CIV_MAX_DOLLARS = 214763892;
        //try to change it
//        CIV_MAX_DOLLARS = 3; // this doesn't work, since we can not modify a 'final' variable

        // ================== EXPRESSIONS (s-11)

        // basically the same as JS
        int firstValue = 97;
        int secondValue = 99;

        int sumOfValues = firstValue + secondValue;
        int deltaValues = firstValue - secondValue;
        int product = firstValue * secondValue;
        int quotient = firstValue / secondValue;

        // ================== OPERATORS (s-12)

        // basically the same as JS
        int reverseNumber = -72;
        int oppositeDay = -reverseNumber;
        int bePositive = +reverseNumber;

        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
        short x = 8;
        int y = x;

        // EXPLICIT
        int civDollars = 20999998;
        byte civSandwich = (byte) civDollars;
        System.out.println("Making a nice civ sandwich: " + civSandwich);

        // implicit casting - less to more precise (widening)

                 float num1 = 2.22F;
                 double num2 = num1;



        // explicit casting - more to less explicit casting (narrowing)

                 double num3 = 3.1;
                 float num4 = (float) num3;

                System.out.println(num4);

    }

}
