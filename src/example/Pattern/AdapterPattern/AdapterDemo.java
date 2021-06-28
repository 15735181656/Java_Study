package example.Pattern.AdapterPattern;

public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","111");
        audioPlayer.play("mp4","222");
        audioPlayer.play("vic","333");
    }
}
