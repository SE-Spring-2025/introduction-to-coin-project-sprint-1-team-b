package client;

import coins.*;

import java.util.Scanner;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");

        // Create the dashboards and register them as observers
        TotalCoins totalCoinsDashboard = new TotalCoins(Coin.getCoinCounter());
        QuarterCounter quarterCounterDashboard = new QuarterCounter(Coin.getCoinCounter());

        fixedDemo();
        interactiveDemo();

        System.out.println();
        System.out.println();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
        System.out.println();
    }

    private static void fixedDemo() {
        System.out.println();
        System.out.println();
        System.out.println("Manufacturing Coins in Fixed Demo:");

        Coin mockCoin = new MockCoin();
        System.out.println("Manufacturing a MockCoin...");
        Coin manufacturedMockCoin = mockCoin.manufacture(mockCoin);
        System.out.println("Result: " + manufacturedMockCoin);

        Coin penny = new Penny();
        System.out.println("Manufacturing a Penny...");
        Coin manufacturedPenny = penny.manufacture(penny);
        System.out.println("Result: " + manufacturedPenny);

        Coin nickel = new Nickel();
        System.out.println("Manufacturing a Nickel...");
        Coin manufacturedNickel = nickel.manufacture(nickel);
        System.out.println("Result: " + manufacturedNickel);

        Coin dime = new Dime();
        System.out.println("Manufacturing a Dime...");
        Coin manufacturedDime = dime.manufacture(dime);
        System.out.println("Result: " + manufacturedDime);

        Coin quarter = new Quarter();
        System.out.println("Manufacturing a Quarter...");
        Coin manufacturedQuarter = quarter.manufacture(quarter);
        System.out.println("Result: " + manufacturedQuarter);

        Coin halfDollar = new HalfDollar();
        System.out.println("Manufacturing a Half Dollar...");
        Coin manufacturedHalfDollar = halfDollar.manufacture(halfDollar);
        System.out.println("Result: " + manufacturedHalfDollar);

        Coin dollar = new Dollar();
        System.out.println("Manufacturing a Dollar...");
        Coin manufacturedDollar = dollar.manufacture(dollar);
        System.out.println("Result: " + manufacturedDollar);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println();
        System.out.println("I'm ready to manufacture a coin!");
        System.out.println("Enter G for a dollar coin.");
        System.out.println("Enter H for a half dollar coin.");
        System.out.println("Enter Q for a quarter coin.");
        System.out.println("Enter D for a dime coin.");
        System.out.println("Enter N for a nickel coin.");
        System.out.println("Enter P for a penny coin.");
        System.out.println();
        System.out.println("Enter X to exit the demo.");
        System.out.println();
    }

    private static void interactiveDemo() {
        System.out.println();
        System.out.println();
        System.out.println("Would you like to manufacture more coins yourself? (Y/n) ");
        String response = keyboard.nextLine();
        response = response.trim();
        if (response.charAt(0) == 'Y' || response.charAt(0) == 'y') {
            runDemo();
        }
    }

    private static void runDemo() {
        Coin c;

        while (true) {
            System.out.println();
            System.out.println();

            printMenu();
            System.out.print("What coin to manufacture? ");
            String response = keyboard.nextLine();
            response = response.trim();
            switch (response.charAt(0)) {
                case 'G':
                    System.out.println("Manufacturing a Dollar...");
                    c = new Dollar();
                    Coin manufacturedDollar = c.manufacture(c);
                    System.out.println("Result: " + manufacturedDollar);
                    break;
                case 'H':
                    System.out.println("Manufacturing a Half Dollar...");
                    c = new HalfDollar();
                    Coin manufacturedHalfDollar = c.manufacture(c);
                    System.out.println("Result: " + manufacturedHalfDollar);
                    break;
                case 'Q':
                    System.out.println("Manufacturing a Quarter...");
                    c = new Quarter();
                    Coin manufacturedQuarter = c.manufacture(c);
                    System.out.println("Result: " + manufacturedQuarter);
                    break;
                case 'D':
                    System.out.println("Manufacturing a Dime...");
                    c = new Dime();
                    Coin manufacturedDime = c.manufacture(c);
                    System.out.println("Result: " + manufacturedDime);
                    break;
                case 'N':
                    System.out.println("Manufacturing a Nickel...");
                    c = new Nickel();
                    Coin manufacturedNickel = c.manufacture(c);
                    System.out.println("Result: " + manufacturedNickel);
                    break;
                case 'P':
                    System.out.println("Manufacturing a Penny...");
                    c = new Penny();
                    Coin manufacturedPenny = c.manufacture(c);
                    System.out.println("Result: " + manufacturedPenny);
                    break;
                case 'X':
                    System.out.println("Exiting the demo...");
                    return;
                default:
                    System.out.println("Invalid entry, try again.");
                    break;
            }
        }
    }
}