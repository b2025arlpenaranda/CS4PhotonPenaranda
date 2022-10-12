package ex04photonpeñaranda;

public class Singer {
    private String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    private Song favoriteSong;
    
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
    
    public void performForAudience(Singer otherSinger, int noOfAudience) {
        noOfPerformances++;
        otherSinger.noOfPerformances++;
        earnings = earnings + ((noOfAudience * 100) / 2);
        otherSinger.earnings = otherSinger.earnings + ((noOfAudience * 100) / 2);
        totalPerformances =+ 2;
    }
    
    public void changeFavSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}

