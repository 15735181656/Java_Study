package example.Pattern.AdapterPattern;

public class VicPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVic(String music) {
        System.out.println("this is vic music : " + music);
    }

    @Override
    public void playMp4(String music) {

    }
}
