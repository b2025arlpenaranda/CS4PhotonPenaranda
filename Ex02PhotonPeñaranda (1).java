package ex02photonpeñaranda;
import java.util.Scanner;

public class Ex02PhotonPeñaranda {
  public static void main(String[] args) {
    boolean repeatMenu = true;
    int numGuess = 5;
    
    while(repeatMenu == true) {
      System.out.print("Welcome to Higher or Lower! What would you like to do?\n-Play\n-Settings\n-Exit Game\nInput: "); // main menu
      Scanner sc = new Scanner(System.in);
      String menuInput = sc.nextLine(); 
      
      if(menuInput.equals("Play")) {
        System.out.print("\nLet's play!\n\n"); // game start
        char playAgain = 'y';

        do { 
          int randNum = (int) Math.floor(Math.random() * 10) + 1;
          
          innerloop:
            for(int i = 0; i < numGuess; i++) {
              int guessRemain = numGuess - i;
              String guessRemainStr = Integer.toString(guessRemain);

              System.out.print("You have " + guessRemain + " guess(es) remaining. What is your guess? ");
              int guess = sc.nextInt();
              
              if(guessRemainStr.equals("1")) {
                System.out.print("\nNice try :( You have lost the game...");
                break innerloop;
              } else if(guess > randNum) {
                System.out.print("Guess lower! ");
              } else if(guess < randNum) {
                System.out.print("Guess higher! ");
              } else if(guess == randNum) {
                System.out.print("\nCongratulations! You have successfully guessed the number.");
                break innerloop;
              } else {
                System.out.print("\nThat's an invalid input. ");
              }
            }

          System.out.print("\nWould you like to play again? (y/n) ");
          playAgain = sc.next().charAt(0);
          System.out.print("\n");
        } while(playAgain == 'y');
      } else if(menuInput.equals("Settings")) { // settings menu
        System.out.print("\nWelcome to the settings menu.\nNumber of Guesses: ");
        numGuess = sc.nextInt();
        if (numGuess < 1) {
          System.out.print("\nNThat is not allowed! Number of guesses reverted to default.");
          numGuess = 5;
        } else {
          System.out.print("\nNumber of guesses changed to " + numGuess + ".\n\n");
        }
      } else if (menuInput.equals("Exit Game")) { // end of application
        System.out.print("\nThank you for playing!");
        repeatMenu = false;
        break;
      } else {
        System.out.print("\nInvalid input! Please try again.\n\n");
      }
    } 
  }
}