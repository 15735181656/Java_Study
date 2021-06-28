package example.Pattern.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVic(String music) {

    }

    @Override
    public void playMp4(String music) {
        System.out.println("this is mp4 music : " + music);
    }
}
