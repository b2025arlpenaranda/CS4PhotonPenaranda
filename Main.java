import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderExample {
  public static void main(String[] args) throws IOException{
    boolean repeat = true;
    
    do {
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader input = new BufferedReader(in);
      System.out.print("Welcome to Higher or Lower! What would you like to do?\n-Play\n-Settings\n-Exit Game\nInput: ");
      String menuInput = input.readLine(); // will fix everything in my free time im bad T_T
      
      if (menuInput == "Exit Game") {
        System.out.print("\nThank you for playing!");
        repeat = false;
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