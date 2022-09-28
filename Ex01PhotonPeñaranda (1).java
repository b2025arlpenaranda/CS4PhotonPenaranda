class Group {
  String name, team;
  int years;
}

public class Ex01PhotonPeñaranda {
  public static void main(String[] args) {
    Group lewHam = new Group(); // info about driver 1 hamilton
    lewHam.name = "Lewis Hamilton";
    lewHam.team = "Mercedes"; 
    lewHam.years = 16; // years refers to total years of racing in F1

    Group sebVet = new Group(); // info about driver 2 vettel
    sebVet.name = "Sebastian Vettel";
    sebVet.team = "Aston Martin";
    sebVet.years = 15;

    Group geoRus = new Group(); // info about driver 3 russell
    geoRus.name = "George Russell";
    geoRus.team = "Mercedes";
    geoRus.years = 4;

    System.out.println("Driver 1:"); // displaying the objects and their values
    System.out.println("Name: " + lewHam.name);
    System.out.println("Team: " + lewHam.team);
    System.out.println("Years of racing: " + lewHam.years + "\n");

    System.out.println("Driver 2:");
    System.out.println("Name: " + sebVet.name);
    System.out.println("Team: " + sebVet.team);
    System.out.println("Years of racing: " + sebVet.years + "\n");

    System.out.println("Driver 3:");
    System.out.println("Name: " + geoRus.name);
    System.out.println("Team: " + geoRus.team);
    System.out.println("Years of racing: " + geoRus.years + "\n");

    int sum = lewHam.years + sebVet.years + geoRus.years; // displaying operations
    System.out.println("Combined total of racing years: " + sum);
    
    System.out.println("Vettel is the most experienced driver out of him, Hamilton, and Russell: " + (sebVet.years > lewHam.years && sebVet.years > geoRus.years));

    System.out.println("Hamilton and Russell are in the same team: " + (lewHam.team == geoRus.team));
  }
}