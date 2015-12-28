/**
 * Created by Вареник Илья on 27.12.2015.
 */
public class TextFile {
    private int size;
    private String location;
    private String name;
    private String type;

    public static void main(String[] args)
    {
        TextFile TextFile = new TextFile();
        TextFile.size = 64;
        TextFile.name = "TextFile";
        TextFile.type = "txt";
        TextFile.location = "D:\projects\HWM3\Folder";
    }
}