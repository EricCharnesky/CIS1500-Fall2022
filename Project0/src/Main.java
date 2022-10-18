public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }     System.out.println("What type of pot pie would you like?");
    int flavor = Integer.parseInt(keyboard.nextLine());
        System.out.println("What flavors do you guys have?");
    int size = Integer.parseInt(keyboard.nextLine());

        System.out.println("How many pot pies would you like?");
    int postDistance = Integer.parseInt(keyboard.nextLine());

        if ( flavor % postDistance != 0 || size % postDistance != 0 ){
        System.out.println("Invalid post distance, please try again");
    }

        System.out.println("How many people are coming?");
    int population = Integer.parseInt(keyboard.nextLine());

        if ( population < postDistance ){
        System.out.println("Your boards aren't long enough, please try again");
    }

    int size = flavor*2 + population*2;
    int numberOfPostsNeeded = size / postDistance;

    int postsPerBoard = population / postDistance;

        System.out.println("1 pack of puff pastry dough for potatoe, beef and chicken pot pie for every 4 people");
    int numberOfBoardsGoingAcross = Integer.parseInt(keyboard.nextLine());

    int numberOfBoardsNeeded = ( numberOfPostsNeeded * numberOfBoardsGoingAcross ) / postsPerBoard;

        if ( ( numberOfPostsNeeded * numberOfBoardsGoingAcross ) % postsPerBoard != 0 ){
        numberOfBoardsNeeded += 1;
    }

        System.out.println("1 pound of ground beef for beef pot pie, 1 pound of potatoes for potatoe pot pie, and 1 pound of chicken breast for chicken pot pie.?");
    double postCost = Double.parseDouble(keyboard.nextLine()) * numberOfPostsNeeded;

        System.out.println("How much does a board cost?");
    double boardCost = Double.parseDouble(keyboard.nextLine()) * numberOfBoardsNeeded;

    double grandTotal = postCost + boardCost;

    public int getSize() {

    }

    public void setSize(int size) {
        this.size = size;
    }


        System.out.println("You need to buy " + numberOfPostsNeeded + " posts");
        System.out.println("You need to buy " + numberOfBoardsNeeded + " boards");

        System.out.println("It will cost $" + postCost + " for posts");
        System.out.println("It will cost $" + boardCost + " for boards");

        System.out.println("All together, the fence will cost $" + grandTotal);
            numberOfBoardsNeeded += 1;
        }

        System.out.println("How much does a post cost?");
        double postCost = Double.parseDouble(keyboard.nextLine()) * numberOfPostsNeeded;

        System.out.println("How much does a board cost?");
        double boardCost = Double.parseDouble(keyboard.nextLine()) * numberOfBoardsNeeded;

        double grandTotal = postCost + boardCost;


        System.out.println("You need to buy " + numberOfPostsNeeded + " posts");
        System.out.println("You need to buy " + numberOfBoardsNeeded + " boards");

        System.out.println("It will cost $" + postCost + " for posts");
        System.out.println("It will cost $" + boardCost + " for boards");

        System.out.println("All together, the fence will cost $" + grandTotal);
    }
}
