package example.Pattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String music) {
        if (type.equals("mp3")){
            System.out.println("this is mp3 music : " + music);
        }
        else if (type.equals("mp4") || type.equals("vic")){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, music);
        }else {
            System.out.println("sorry , not find type!");
        }
    }
}
