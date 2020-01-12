package laboratorium15;

public class StreamPlayer extends MusicPlayer{

    @Override
    public void play() {
        System.out.println("Stream Player is playing now");
    }

    @Override
    public void pause() {
        System.out.println("Stream Player is paused");
    }

    @Override
    public void next() {
        System.out.println("Stream Player is playing next songs");
    }

    @Override
    public void previous() {
        System.out.println("Stream Player is playing previous songs");
    }
}
