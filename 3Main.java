package ex03photonpeñaranda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfAudience;
        
        System.out.print("Here is a list of some of the most legendary musicians of this century.\n\n");
        Musicians robertP = new Musicians("Robert Plant", "Vocalist", 74);
        System.out.println(robertP + "\n");
        
        Musicians davidG = new Musicians("David Gilmour", "Guitarist", 76);
        System.out.println(davidG + "\n");
        
        Musicians philC = new Musicians("Phil Collins", "Drummer", 71);
        System.out.println(philC + "\n");
        
        System.out.println("----------\n\nA performer comes up the stage.\n");
        Singer paulMc = new Singer("Paul McCartney", 0, 100.00, new Song("Here, There And Everywhere", "The Beatles"));
        
        System.out.print(paulMc);
        
        System.out.println("\n\nHe will now be performing.");
        System.out.printf("\nHow many audience members are there? ");
        noOfAudience = Integer.parseInt(sc.nextLine());
        paulMc.performForAudience(noOfAudience);
        
        System.out.println("\nPaul changed his favorite song.\n");
        paulMc.changeFavSong(new Song("Hey Jude", "The Beatles"));
        System.out.print(paulMc);
    }
    
}
