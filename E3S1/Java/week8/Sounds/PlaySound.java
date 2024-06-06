import sounds.DolbySound;
import sounds.Podcast;


public class PlaySound {
    public static void main(String[] args) {
    	DolbySound d = new DolbySound();
    	Podcast p = new Podcast();
    	
    	System.out.println(d.playDolby());
    	System.out.println(p.playPodcast());
    }
}
