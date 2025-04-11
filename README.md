﻿# Coin Project Sprint 3

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


# Sprint 3 

## Sprint Goal
### The goal of the sprint is to refactor the metallurgy to use the Strategy design pattern. And, as
always, our code meets our corporate requirements: checkstyle, unit testing.

## Tasks Completed
### 1. Created a Metallurgy interface and concrete implementations for Cupronickel and Copper.
### 2. Created Unit testing for the Metallurgy Concrete classes.
### 3. Refactored the Coins class to: 
* Add a Metallurgy delegated by smelter
* implement a smelt method using smelter delegate.
### 4. Updated all concrete coin classes to pass the metallurgy object instead of hardcoding it with a String.

