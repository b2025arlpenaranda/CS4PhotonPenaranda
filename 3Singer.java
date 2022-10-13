package ex03photonpeñaranda;

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    @Override
    public String toString() {
        return  "Name: " + name + "\nNumber of Performances: " + noOfPerformances + "\nEarnings: " + earnings + "\nFavorite Song: " + favoriteSong;
    }
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int noOfAudience) {
    noOfPerformances++;
    earnings = earnings + (noOfAudience * 100);
    }
    
    public void changeFavSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}

