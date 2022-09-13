
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("Are you Male or Female (M/F): ");
        String gender = keyboard.nextLine();

        // and &&
        // true && true == true
        // true && false == false
        // false && true == false
        // false && false == false

        if ( age < 25 && gender.equalsIgnoreCase("m")){
            System.out.println("Your insurance rate is $250/month");
        } else if ( age < 25 ){
            System.out.println("Your insurance rate is $200/month");
        } else {
            System.out.println("Your insurance rate is $150/month");
        }

        // || OR - shift backslash key above the enter key - pipe
        // true || true == true
        // true || false == true
        // false || true == true
        // false || false == false

        System.out.println("Please enter your annual income: ");
        int annualIncome = Integer.parseInt(keyboard.nextLine());

        System.out.println("Do you have any previous bankruptcies? (y/n");
        String previousBankruptcies = keyboard.nextLine();

        if ( annualIncome > 1_000_000 ||
                ( annualIncome > 50_000 &&
                        previousBankruptcies.equalsIgnoreCase("n")) ){
            System.out.println("Here's your loan");
        } else{
            System.out.println("No loan for you!");
        }

        // not !
        // !true == false
        // !false == true
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = keyboard.nextLine();

        // while play again is NOT equal to N
        while ( !playAgain.equalsIgnoreCase("n")){
            System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }

    }
}