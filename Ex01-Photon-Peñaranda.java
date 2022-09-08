class Group {
  String name, team;
  int years;
}

public class Main {
  public static void main(String[] args) {
    Group lewisHamilton = new Group(); // info about driver 1 hamilton
    lewisHamilton.name = "Lewis Hamilton";
    lewisHamilton.team = "Mercedes"; 
    lewisHamilton.years = 16; // years refers to total years of racing in F1

    Group sebastianVettel = new Group(); // info about driver 2 vettel
    sebastianVettel.name = "Sebastian Vettel";
    sebastianVettel.team = "Aston Martin";
    sebastianVettel.years = 15;

    Group georgeRussell = new Group(); // info about driver 3 russell
    georgeRussell.name = "George Russell";
    georgeRussell.team = "Mercedes";
    georgeRussell.years = 4;

    int sum = lewisHamilton.years + sebastianVettel.years + georgeRussell.years;
    System.out.println("Combined total of racing years: " + sum);
    
    System.out.println("Vettel is the most experienced driver out of him, Hamilton, and Russell: " + (sebastianVettel.years > lewisHamilton.years && sebastianVettel.years > georgeRussell.years));

    System.out.println("Hamilton and Russell are in the same team: " + (lewisHamilton.team == georgeRussell.team));
  }
}