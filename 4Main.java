package ex04photonpeñaranda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfAudience;
        String duo;
        
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
        
        System.out.println("\n\nAnother performer is also present.\n");
        Singer johnLe = new Singer("John Lennon", 0, 100.00, new Song("Don't Let Me Down", "The Beatles"));
        System.out.print(johnLe);
        
        System.out.println("\n\nThey are now ready to perform.");
        
        System.out.print("\nHow many audience members are there? ");
        noOfAudience = Integer.parseInt(sc.nextLine());
        System.out.print("Should the two singers perform together? (Y/N)");
        duo = sc.nextLine();
        
        if(duo.equals("Y")) {
            paulMc.performForAudience(johnLe, noOfAudience);
            System.out.print("\n" + paulMc + "\n\n");
            System.out.print(johnLe);
        } else {
            paulMc.performForAudience(noOfAudience);
            System.out.print(paulMc);
        }
        
        System.out.println("\n\n----------\n\nPaul changed his favorite song.\n");
        paulMc.changeFavSong(new Song("Hey Jude", "The Beatles"));
        System.out.print(paulMc);
    }
    
}
