/*
 * Steven Wiltse
 * Assignment 1, Part 2
 * Concordia St. Paul - SUMMER 100 CSC 422 Software Engineering
 * 
 * written: 05/12/2021
 * revised: 05/14/2021
 */

 /**
  * Pet database
  */

import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {
  boolean run = true;
  while(run){
    Scanner select = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What would you like to do?");
    System.out.println("1) View all pets");
    System.out.println("2) Add more pets");
    System.out.println("3) Update an existing pet");
    System.out.println("4) Remove an existing pet");
    System.out.println("5) Search pets by name");
    System.out.println("6) Search pets by age");
    System.out.println("7) Exit program");
    
    
    int userChoice = select.nextInt();  // Read user input
    System.out.println("Your choice: " + userChoice);
    
    if (userChoice == 7){
        run = false;
        System.out.println("Your choice: " + userChoice + " Goodbye!");
    }
  }
  }
}
