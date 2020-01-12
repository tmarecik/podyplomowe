package laboratorium15;

public class CdPlayer extends MusicPlayer{

    @Override
    public void play() {
        System.out.println("Cd Player is playing now");
    }

    @Override
    public void pause() {
        System.out.println("Cd Player is paused");
    }

    @Override
    public void next() {
        System.out.println("Cd Player is playing next songs");
    }

    @Override
    public void previous() {
        System.out.println("Cd Player is playing previous songs");
    }
}
