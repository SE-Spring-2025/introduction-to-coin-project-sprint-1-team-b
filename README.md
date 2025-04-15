# Coins Project Sprint_4

## USER GUIDE:
## How to compile and run code. 
### This command clears any previous attempts to compile code. 
make clean 

### This command compiles the code.
make compile

### This command runs the demo.
make demo  

### This command runs the tests
make test

### This command checks if Checkstyle is being used correctly
make check


# Sprint 4 

## Sprint Goal
### The goal of the sprint is to add "dashboards" as observers. And, as always, our code meets our corporate requirements: checkstyle, unit testing.

## Tasks Completed
### 1. Created a CoinCounter class to track the count of each coin type.
### 2. Implemented the Observer pattern:
* Created an Observer interface.
* Created TotalCoins and QuarterCounter classes as observers.
### 3. Updated the Coin class:
* Added a static CoinCounter composition.
* Added methods to notify observers when coin counts change.
### 4. Updated all concrete coin classes to increment the CoinCounter when coins are created.
### 5. Updated the Demo class to demonstrate dashboards updating in real-time as coins are created.
