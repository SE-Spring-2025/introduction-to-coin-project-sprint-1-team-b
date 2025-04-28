package client;

import coins.*;

public class Demo {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");

        // Create the dashboards and register them as observers
        TotalCoins totalCoinsDashboard = new TotalCoins(Coin.getCoinCounter());
        QuarterCounter quarterCounterDashboard = new QuarterCounter(Coin.getCoinCounter());

        fixedDemo();

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
        System.out.println();

        Coin penny = new Penny();
        System.out.println("Manufacturing a Penny...");
        Coin manufacturedPenny = penny.manufacture(penny);
        System.out.println("Result: " + manufacturedPenny);
        System.out.println();

        Coin nickel = new Nickel();
        System.out.println("Manufacturing a Nickel...");
        Coin manufacturedNickel = nickel.manufacture(nickel);
        System.out.println("Result: " + manufacturedNickel);
        System.out.println();

        Coin dime = new Dime();
        System.out.println("Manufacturing a Dime...");
        Coin manufacturedDime = dime.manufacture(dime);
        System.out.println("Result: " + manufacturedDime);
        System.out.println();

        Coin quarter = new Quarter();
        System.out.println("Manufacturing a Quarter...");
        Coin manufacturedQuarter = quarter.manufacture(quarter);
        System.out.println("Result: " + manufacturedQuarter);
        System.out.println();

        Coin halfDollar = new HalfDollar();
        System.out.println("Manufacturing a Half Dollar...");
        Coin manufacturedHalfDollar = halfDollar.manufacture(halfDollar);
        System.out.println("Result: " + manufacturedHalfDollar);
        System.out.println();

        Coin dollar = new Dollar();
        System.out.println("Manufacturing a Dollar...");
        Coin manufacturedDollar = dollar.manufacture(dollar);
        System.out.println("Result: " + manufacturedDollar);
        System.out.println();
    }
}