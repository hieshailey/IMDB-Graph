import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;


public class FileManager {

    private static FileManager fileManager;

    public static FileManager getInstance(){
        if (fileManager == null)
            fileManager = new FileManager();

        return fileManager;
    }

    public BufferedReader getFile(String path){
        try {

            File file = new File(URLDecoder.decode(getClass().getResource(path).getPath()));
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            return br;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


}
