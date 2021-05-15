/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {
  boolean run = true;
  while(run){
    Scanner select = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What would you like to do?");

    String userName = select.nextLine();  // Read user input
    System.out.println("Selection is: " + userName);
  }
  }
}