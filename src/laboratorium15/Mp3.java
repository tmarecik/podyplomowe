package laboratorium15;

public class Mp3 extends MusicPlayer{


//    @Override
//    public void play() {
//        System.out.println("MP3 Player is playing now");
//    }

    @Override
    public void pause() {
        System.out.println("MP3 Player is paused");
    }

    @Override
    public void next() {
        System.out.println("MP3 Player is playing next songs");
    }

    @Override
    public void previous() {
        System.out.println("MP3 Player is playing previous songs");
    }
}
