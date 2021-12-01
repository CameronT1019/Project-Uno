import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicGame 
{
    void playMusic(String musicLocation)
    {
        try
        {
            File musicPath = new File(musicLocation);
            
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(clip.LOOP_CONTINUOUSLY);
            }
            else
            {
                System.out.println("Cant find music file");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
