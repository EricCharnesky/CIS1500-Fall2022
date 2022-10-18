import java.util.Scanner;

public class Main {

    public static int getNumberOfPeopleComingToTheParty(String name){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(name + ", how many people are coming to the party?");
        int numberOfPeopleComingToTheParty = Integer.parseInt(keyboard.nextLine());
        return numberOfPeopleComingToTheParty;
    }

    public static void printRequiredIngredients(String name, int numberOfPuffPastryPacksRequired,
                            String otherIngredientName, int poundsOfOtherIngredient){
        System.out.println(name + ", you need to buy " + numberOfPuffPastryPacksRequired +
                " packs of puff pastry and " + poundsOfOtherIngredient + " pounds of " + otherIngredientName);
    }

    public static double getCostOf(String name, String itemName){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(name + ", how much does " + itemName + "cost?");
        double cost = Double.parseDouble(keyboard.nextLine());
        return cost;
    }

    public static int divisionRoundedUp(int dividend, int divisor){
        int result = dividend / divisor;
        if ( dividend % divisor != 0 ){
            result++;
        }
        return result;
    }

    public static void printItemAndTotalCost(double puffPastryCost, String itemName, double itemCost){
        System.out.println("It will cost $" + puffPastryCost + " for puff pastry" );
        System.out.println("It will cost $" + itemCost + " for " + itemName);
        System.out.println("Your total cost is $" + (itemCost + puffPastryCost));
    }

    public static void main(String[] args) {
        final int NUMBER_OF_PEOPLE_PER_PUFF_PASTRY = 4;
        final int NUMBER_OF_PEOPLE_PER_POUND_OF_BEEF = 5;
        final int NUMBER_OF_PEOPLE_PER_POUND_OF_CHICKEN = 6;
        final int NUMBER_OF_PEOPLE_PER_POUND_OF_POTATO = 3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        System.out.println(name + ", what kind of pot pies are you going to make? " +
                "(beef, chicken, potato");
        String potPieType = keyboard.nextLine();

        if ( potPieType.equalsIgnoreCase("beef")){
            int numberOfPeopleComingToTheParty = getNumberOfPeopleComingToTheParty(name);
            int numberOfPuffPastryPacksRequired = divisionRoundedUp(numberOfPeopleComingToTheParty,NUMBER_OF_PEOPLE_PER_PUFF_PASTRY);
            int poundsOfBeefRequired = divisionRoundedUp(numberOfPeopleComingToTheParty, NUMBER_OF_PEOPLE_PER_POUND_OF_BEEF);

            printRequiredIngredients(name,numberOfPuffPastryPacksRequired, "beef", poundsOfBeefRequired);

            double puffPastryCost = getCostOf(name,"pack of puff pastry");
            double poundOfBeefCost = getCostOf(name, "pound of beef");

            printItemAndTotalCost(puffPastryCost * numberOfPuffPastryPacksRequired, "beef",
                    poundOfBeefCost *poundsOfBeefRequired );

        } else if ( potPieType.equalsIgnoreCase("chicken")){
            int numberOfPeopleComingToTheParty = getNumberOfPeopleComingToTheParty(name);
            int numberOfPuffPastryPacksRequired = divisionRoundedUp(numberOfPeopleComingToTheParty,NUMBER_OF_PEOPLE_PER_PUFF_PASTRY);
            int poundsOfChickenRequired = divisionRoundedUp(numberOfPeopleComingToTheParty, NUMBER_OF_PEOPLE_PER_POUND_OF_CHICKEN);
            printRequiredIngredients(name,numberOfPuffPastryPacksRequired, "chicken", poundsOfChickenRequired);

            double puffPastryCost = getCostOf(name, "pack of puff pastry");
            double poundOfChickenCost = getCostOf(name, "pound of chicken");

            printItemAndTotalCost(puffPastryCost * numberOfPuffPastryPacksRequired, "chicken",
                    poundOfChickenCost *poundsOfChickenRequired );

        } else if ( potPieType.equalsIgnoreCase("potato")){
            int numberOfPeopleComingToTheParty = getNumberOfPeopleComingToTheParty(name);
            int numberOfPuffPastryPacksRequired = divisionRoundedUp(numberOfPeopleComingToTheParty,NUMBER_OF_PEOPLE_PER_PUFF_PASTRY);
            int poundsOfPotatoRequired = divisionRoundedUp(numberOfPeopleComingToTheParty, NUMBER_OF_PEOPLE_PER_POUND_OF_POTATO);
            printRequiredIngredients(name,numberOfPuffPastryPacksRequired, "potato", poundsOfPotatoRequired);
            double puffPastryCost = getCostOf(name, "pack of puff pastry");
            double poundOfPotatoCost = getCostOf(name, "pound of potato");

            printItemAndTotalCost(puffPastryCost * numberOfPuffPastryPacksRequired, "potato",
                    poundOfPotatoCost *poundsOfPotatoRequired );

        } else {
            System.out.println(name + ", I can't help with that kind of pot pie, please try again!");
        }
    }
}