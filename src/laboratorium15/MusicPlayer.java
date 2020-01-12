package laboratorium15;

abstract public class MusicPlayer implements Player{
    Song[][] songList;
    int songListIndex = 0;


    public MusicPlayer() {
        this.songList = new Song[1000][1000];
    }

    @Override
    public void play() {
        if(songList[0][0] != null) {
            this.songList[0][0].getSongInfo();
        } else {
            System.out.println("there is no more songs, please pres prevoius or load oter songs");
        }
    }

    @Override
    public void pause() {
    }

    @Override
    public void next() {

//        if(songListIndex)
    }

    @Override
    public void previous() {
    }

    public void appendSong(Song[] album) {
        this.songList[songListIndex] = album;
        songListIndex++;
    }
}
