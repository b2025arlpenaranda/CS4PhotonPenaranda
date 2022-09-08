import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    
    do {
      Scanner sc = new Scanner(System.in);
      System.out.print("Welcome to Higher or Lower! What would you like to do?\n-Play\n-Settings\n-Exit Game\nInput: ");
      String menuInput = sc.nextLine(); 
      
      if (menuInput == "Exit Game") {
        System.out.print("\nThank you for playing!");
        repeat = false;
        sc.close();
        break;
      } else if(menuInput == "Play") {
        System.out.print("\nLet's play!");
        repeat = false;
        break;
      } else if(menuInput == "Settings") {
        System.out.print("\nWelcome to the settings menu.");
        repeat = false;
        break;
      } else {
        System.out.print("\nInvalid input! Please try again.\n\n");
      }
    } while(repeat = true);
  }
}