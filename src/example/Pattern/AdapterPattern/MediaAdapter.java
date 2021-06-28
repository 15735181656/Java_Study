package example.Pattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if (type.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }else if (type.equals("vic")){
            advancedMediaPlayer = new VicPlayer();
        }
    }

    @Override
    public void play(String type, String music) {
        if (type.equals("mp4")){
            advancedMediaPlayer.playMp4(music);
        }else if (type.equals("vic")){
            advancedMediaPlayer.playVic(music);
        }
    }
}
