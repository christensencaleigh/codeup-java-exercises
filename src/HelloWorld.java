public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // #1
        int myFavoriteNumber = 13;
        System.out.println("My favorite number is: " + myFavoriteNumber);
        // #2
        String myString = "Caleigh Quinn Christensen";
        System.out.println("My full name is: " + myString);
        // #3
//        myString = 'c'; doesn't work because we provided a char type instead of the expected String type
        // #4
//        myString = 3.14159; doesn't work because we provided a double instead of expected String type
        // #5
        long myNumber;
//        System.out.println(myNumber); // error message because the variable myNumber has not been initialized yet
        // #6
//        myNumber = 3.14; // doesn't work because we provided a double instead of the expected long type
        // #7
        myNumber = 123L;
        System.out.println(myNumber);
        // #8
        myNumber = 123;
        System.out.println(myNumber);
        // L needed for compiler, to indicate it is long
        // #9
//        float myNumber = 3.14;
        // ????
        // #10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // displays 5 then 6
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // displays 6 then 6
        //the difference is the first code block is using post-increment and the second is doing pre-increment. post-increment executes after its evaluated and pre-increment executes before it's evaluated
        // #11
//        String class = "Hello World!"; won't let you use the name class because it is a reserved word in Java
        // #12
        // it will make an exception because it an object type and any value can be assigned to it
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //yes it matches my expectation.
//        int three = (int) "three";
        // error: cannot cast an int to a String type
        // #13
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
        // #14
        int bigNumber = Integer.MAX_VALUE;
        System.out.println(bigNumber);
    }
}
