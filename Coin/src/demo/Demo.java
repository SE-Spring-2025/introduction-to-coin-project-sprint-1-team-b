package demo;

import Coins.*;
import tests.*;

public class Demo 
{
    public static void main(String[] args)
    {
        CoinTest t = new CoinTest();
        t.testConstructors();
        t.testGetters();
        t.testToString();
        t.testCoinGetters();
    }
}
