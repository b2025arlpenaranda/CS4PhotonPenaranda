package ex03photonpeñaranda;

public class Song {
  String title, artist;
  
  @Override
    public String toString() {
        return  title + " by " + artist;
    }

  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }
}
