package chapter2;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {

        // declaring a variable
        int yourNumber;

        // assign the value 10 to the variable yourNumber
        yourNumber = 10;

        System.out.println("Your number is:" + yourNumber);

        // declare and assign - I like this way
        int myFavoriteNumber = 42;

        System.out.println("My favorite number is: " + myFavoriteNumber);

        double numberWithADecimal = 7.7;

        yourNumber = 12;

        // a double can hold and int
        numberWithADecimal = 12;

        // java doesn't care about your variable names
        // people care you your variable names
        int a = 10;
        int b = 20;
        int c = 30;


        // but an int can't hold a double
        // yourNumber = 7.7;

        numberWithADecimal = yourNumber;

        System.out.println("Number with a decmial's value is: " + numberWithADecimal);

        System.out.println("Your number is:" + yourNumber);

        // Please Excuse My Dear Aunt Sally
        // Parenthesis Exponents ( Multiplication Division ) ( Addition Subtraction )

        System.out.println("What is 5 - 2 + 3");
        System.out.println(5 - 2 + 3);
        System.out.println("95% of people can't figure this one out: 9 / 3 * 3 + 2");
        System.out.println(9 / 3 * 3 + 2);

        myFavoriteNumber = 10 + 2;
        myFavoriteNumber = myFavoriteNumber + 10;
        // combined assignment operator
        myFavoriteNumber += 10;

        // not a combined assignment operator - this will set the value to Positive 10
        myFavoriteNumber =+ 10;

        myFavoriteNumber = yourNumber * 3 + 6;

        System.out.println("My favorite number is now: " + myFavoriteNumber);

        // integer division gives Integer results - % is the modulus operator, gives the remainder
        System.out.println("5 / 2 == " + 5 / 2 + " with a reminder of: " + 5 % 2);

        // to get a double result from division, one or both need to be a double
        double answer = 5.0 / 2;

        System.out.println("5 / 2 with a decimal result is: " + answer);

        // to treat a value as a double, you can 'cast' it as double with (double)
        double myFavoriteNumberDividedByYourFavoriteNumber = (double)myFavoriteNumber / yourNumber;

        System.out.println(myFavoriteNumberDividedByYourFavoriteNumber);


        String firstName = "Eric";
        String lastName = "Charnesky";

        String fullName = firstName + " " + lastName;

        // we're not "adding" we're concatenating
        System.out.println(fullName);

        String ericsNameAndFavoriteNumber = fullName + " " + myFavoriteNumber;

        System.out.println(ericsNameAndFavoriteNumber);

        // the backslash is the 'escape' character - means the next letter is special
        System.out.println("My friend O'Shane said \"Hey Eric!\"");

        // \n new line - goes down a line
        System.out.println("New Line == \n \\n");


        // \t is a tab
        System.out.println("My Coffee Menu:");
        System.out.println("$1\t\tCoffee");
        System.out.println("$1.5\tEspresso");
        System.out.println("$2\t\tLatte");

        System.out.println("My Coffee Menu:");
        System.out.println("$1    Coffee");
        System.out.println("$1.5  Espresso");
        System.out.println("$2    Latte");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = keyboard.nextLine();

        System.out.println("Hi there " + name);

        System.out.println("How many coffees do you want to buy today?");
        // don't use nextInt() - it causes problems later
        // int coffeesForToday = keyboard.nextInt();

        // I always recommend Integer.parseInt
        int coffeesForToday = Integer.parseInt(keyboard.nextLine());

        System.out.println("How much does a coffee cost?");
        double costPerCoffee = Double.parseDouble(keyboard.nextLine());

        System.out.println("That will cost you $" + coffeesForToday * costPerCoffee);


    }
}
