import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Random random = new Random();
        for(int n = 0; n < 100; n++ ){
            System.out.println(random.nextInt(100,1000));}
        //Variable declaration
        int Posts;
        int Boards;
        int BoardNumber = 0;
        double BoardLength = 0;
        double FenceWidth = 0;
        double FenceLength = 0;
        double PostSpacing = 0;
        double PostCost;
        double BoardCost;

        //Scanner creation
        Scanner Input = new Scanner(System.in);

        //Welcome
        System.out.println("Welcome to the FenceCalculator");
        System.out.println("ver 1.1.2");
        System.out.println("");

        //User input and verification loop
        while(FenceLength % PostSpacing != 0 || FenceWidth % PostSpacing != 0)
        {
            System.out.println("What is the width of your fence? (in feet)");
            FenceWidth = Double.parseDouble(Input.nextLine());
            System.out.println("What is the length of your fence? (in feet)");
            FenceLength = Double.parseDouble(Input.nextLine());
            System.out.println("How far apart do you want to space apart your posts? (in feet)");
            PostSpacing = Double.parseDouble(Input.nextLine());

            if(FenceLength % PostSpacing != 0 || FenceWidth % PostSpacing != 0)
            {
                System.out.println("Post spacing does not fit within the width and/or length of the fence, try again");
                System.out.println("");
                System.out.println("");
            }
        }
        //Post calculation and result return
        Posts = (int) (((FenceWidth/PostSpacing)+(FenceLength/PostSpacing))*2);
        System.out.println("You need " + Posts + " Posts");
        System.out.println("");
        System.out.println("");

        //Board input and verification loop
        while(BoardLength < PostSpacing)
        {
            System.out.println("How long are your boards? (in feet)");
            BoardLength = Double.parseDouble(Input.nextLine());

            if(BoardLength < PostSpacing)
            {
                System.out.println("Your boards are too small to be used with your specified post spacing, try again");
                System.out.println("");
                System.out.println("");
            }
        }
        //Board count and return results
        System.out.println("How many boards do you want to run across each post?");
        BoardNumber = Integer.parseInt(Input.nextLine());
        Boards = (int) ((Math.ceil(FenceLength/BoardLength))+(Math.ceil(FenceWidth/BoardLength)))*2*BoardNumber;
        System.out.println("You need " + Boards + " boards");
        System.out.println("");
        System.out.println("");

        //Price input
        System.out.println("How much does each post cost? (in USD)");
        PostCost = Double.parseDouble(Input.nextLine());
        System.out.println("How much does each board cost? (in USD)");
        BoardCost = Double.parseDouble(Input.nextLine());

        //Final result return
        System.out.println("");
        System.out.println("Final Results:");
        System.out.println("Fence Dimensions: " + FenceLength + " x " + FenceWidth + " Feet");
        System.out.println("Post Spacing: " + PostSpacing + " Feet");
        System.out.println("Board Length: " + BoardLength + " Feet");
        System.out.println("Number of boards going across: " + BoardNumber);
        System.out.println("Posts Required: " + Posts);
        System.out.println("Boards Required: " + Boards);
        System.out.println("Cost of Posts: $" + PostCost*Posts);
        System.out.println("Cost of Boards: $" + BoardCost*Boards);
        System.out.println("Total Cost: $" + ((BoardCost*Boards)+(PostCost*Posts)));
    }
}