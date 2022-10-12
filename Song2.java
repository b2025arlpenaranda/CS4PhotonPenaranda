package ex04photonpeñaranda;

public class Song {
  private String title, artist;
  
  @Override
    public String toString() {
        return  title + " by " + artist;
    }

  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }
}

