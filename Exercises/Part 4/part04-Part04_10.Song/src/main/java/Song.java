public class Song {
    private String name;
    private int length;
    
    public Song(String nameOfSong, int lengthOfSong) {
        this.name = nameOfSong;
        this.length = lengthOfSong;
    }
    public String name() {
        return this.name;
    }
    public int length() {
        return this.length;
    }
}
