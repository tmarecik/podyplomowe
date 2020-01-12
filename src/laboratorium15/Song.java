package laboratorium15;

public class Song {
    private String artist;
    private String title;
    private String album;

    private Song(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    public void getSongInfo(){
        System.out.println( "Artist: " + this.artist + " Title: " + this.title + " Album: " + album );
    }

//    @Override
//    public String toString() {
//        return "Song{" +
//                "artist='" + artist + '\'' +
//                ", title='" + title + '\'' +
//                ", album='" + album + '\'' +
//                '}';
//    }
}
