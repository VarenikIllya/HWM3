/**
 * Created by Вареник Илья on 27.12.2015.
 */
public class SoundFile {
    private int size;
    private String location;
    private String name;
    private String type;

    public static void main(String[] args)
    {
        SoundFile SoundFile = new SoundFile();
        SoundFile.size = 2048;
        SoundFile.name = "SoundFile";
        SoundFile.type = "mp3";
        SoundFile.location = "D:\projects\HWM3\Folder";
    }
}
